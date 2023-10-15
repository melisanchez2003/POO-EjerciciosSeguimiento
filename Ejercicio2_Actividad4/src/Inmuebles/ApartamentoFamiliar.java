
package Inmuebles;


public class ApartamentoFamiliar extends Apartamento{
    
    protected static double valorArea = 2000000;
    protected int valorAdministración;
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int valorAdministracion){

    super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    this.valorAdministración = valorAdministracion;
}

    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion = $"+valorAdministración);
        System.out.println();
        
    }
    
}


