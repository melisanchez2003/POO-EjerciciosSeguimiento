
package Inmuebles;

public class ApartaEstudio extends Apartamento{
    
    protected static double valorArea = 1500000;
    
    public ApartaEstudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
    
    super(identificadorInmobiliario, area, direccion, 1, 1);
    
}

    void imprimir() {
        super.imprimir();
        System.out.println();
        
    }
}

    
   
