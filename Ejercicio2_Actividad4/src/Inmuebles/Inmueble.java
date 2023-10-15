
package Inmuebles;


public class Inmueble {
   
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;


    
    Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
        
}
    
    double calcularPrecioVenta(double valorArea){
        precioVenta = area * valorArea;
        return precioVenta;
    }
    
    void imprimir (){
        System.out.println("Identificadior inmobiliario =" + identificadorInmobiliario);
        System.out.println("Area = " + area);
        System.out.println("Direccion =" + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}
