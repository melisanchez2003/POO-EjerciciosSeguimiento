
package com.mycompany.pooer5;

/**
 *
 * @author melis
 */

import java.util.Scanner; 
public class POOER5 {
    // Ejercicio resuleto 5
    // Melisa Sanchez Zuluaga

    public static void main(String[] args) {
        double SUMA, X, Y;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor para suma");
        SUMA=entrada.nextDouble(); //Inicializo la variable suma
        X=20;
        SUMA= X + SUMA;
        Y=40;
        X= X + Math.pow(Y, 2);
        SUMA= SUMA + X/Y;
        
        System.out.println("El valor de la suma es: " + SUMA );
        
    }
}
