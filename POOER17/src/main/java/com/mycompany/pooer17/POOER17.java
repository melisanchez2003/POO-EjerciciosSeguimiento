
package com.mycompany.pooer17;

/**
 *
 * @author melis
 */

import java.util.Scanner;

public class POOER17 {
    
    // Ejercicio resuelto 17
    // Melisa Sanchez Zuluaga

    public static void main(String[] args) {
        
        int suma=0,num=1, n;  
        
        // lectura del número de naturales a sumar
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el número de naturales a sumar");
        n = entrada.nextInt(); // número de naturales a sumar
        
        while(num<=n){
             suma=suma+num;
             num=num+1;
        }
        
        System.out.println("La suma es: " +suma);
    }
}
