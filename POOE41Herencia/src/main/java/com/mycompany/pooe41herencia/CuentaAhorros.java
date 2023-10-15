
package com.mycompany.pooe41herencia;

/**
 *
 * @author melis
 */

/**
* Esta clase denominada CuentaAhorros modela una cuenta de ahorros
* que es una subclase de Cuenta. Tiene un nuevo atributo: activa.
* @version 1.2/2020
*/

public class CuentaAhorros extends Cuenta {
 
    private boolean activa=false;
    
    public CuentaAhorros(float saldo, float tasa) {
        
        super(saldo, tasa);
    
        if(saldo > 10000){ activa=true;}
     
    }
  
    @Override
    public void retirar(float cantidad) {
       
       if (activa) super.retirar(cantidad);
    
    }
       
    @Override
    public void consignar(float cantidad) {
        if (activa) super.consignar(cantidad);
        
    }
    
    @Override
    public void extractoMensual() {
    
        if (numeroRetiros > 4) { comisionMensual += (numeroRetiros - 4) * 1000;}
        super.extractoMensual(); 
        if ( saldo < 10000 ){ activa = false;}
    }
    
    
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println();
       
        
    }
    
}

