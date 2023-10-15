
package Inmuebles;


public class Casa extends InmuebleVivienda{
    
    protected int numeroPisos;
    
    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        
        this.numeroPisos = numeroPisos;
}


    
    void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos = " + numeroPisos);
    }
}

