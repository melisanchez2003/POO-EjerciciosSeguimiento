/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer12;

/**
 *
 * @author melis
 */

import java.util.Scanner;
public class POOER12 {
    // Ejercicio resuelto 12
    // Melisa Sanchez Zuluaga

    public static void main(String[] args) {
        // definción de variables

        int nht, het, hee8;
        double vhn, salario;
        String nom;
        
        // lectura de datos
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador");
        nom = entrada.nextLine(); // nombre del trabajador
        
        System.out.println("Ingrese las horas trabajadas");
        nht= entrada.nextInt(); // horas trabajadas
        
        System.out.println("Ingrese valor de hora normal");
        vhn= entrada.nextDouble(); // costo de la hora normal trabajada
        
        if (nht>40){
            het=nht-40; // cálculo de horas extras trabajadas
            if (het>8){
                hee8=het-8; // cálculo de horas extras qeu exceden las 8 horas
                salario=40*vhn + 16*vhn + hee8*3*vhn; // cálculo de salario para horas extras mayores a 8
            }
            else {
                salario=40*vhn + 2*het*vhn; // cálculo de salario para horas extras inferiores o iguales a 8
            }
        }
        else {
             salario=nht*vhn; // cálculo para salario sin horas extras
        }
        
       System.out.println("El trabajador "+ nom + " devengó " + salario); 
    }
}

