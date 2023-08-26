
package com.mycompany.pooer4;

/**
 *
 * @author melis
 */

import java.util.Scanner;
public class POOER4 {
    // Ejercicio resuleto 4
    // Melisa Sanchez Zuluaga

    public static void main(String[] args) {
        int edjuan, edalber,edana,edmama;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan"); //edad de Juan
        edjuan= entrada.nextInt();
        
        edalber= 2*(edjuan/3); // edad de Alberto
        edana= 4*(edjuan/3); // edad de Ana
        edmama= edjuan + edalber + edana; // Edad de la mamá
        
        System.out.println("La edad de Juan es: " + edjuan + " años");
        System.out.println("La edad de Alberto es: " + edalber + " años");
        System.out.println("La edad de Ana es: " + edana + " años");
        System.out.println("La edad de la mamá es: " + edmama + " años");
    }
}
