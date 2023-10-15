
package com.mycompany.pooe41herencia;

/**
 *
 * @author melis
 */
public class Cuenta {
   
    protected float saldo=0;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad) {
        saldo = saldo + cantidad; 
        numeroConsignaciones++;
        System.out.println("Se ha consignado existosamente");
}
    
    public void retirar(float cantidad) {
      
        if (saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
            System.out.println("Se ha retirado existosamente");
    }   
        else {
            System.out.println("La cantida a retirar excede el saldo actual.");
        }
    }
    
 
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12; 
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; 
    }
   
    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
        System.out.println("Se he calculado existosamente");
        System.out.println();
    }
    
}
