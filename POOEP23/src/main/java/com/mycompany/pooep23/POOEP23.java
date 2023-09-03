/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep23;

/**
 *
 * @author melis
 */

import java.util.Scanner;
public class POOEP23 {

    public static void main(String[] args) {
        double A;
        double B;
        double C;
        double ANS1;
        double ANS2;
        double DIS;

        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A :");
        A = entrada.nextDouble(); 
        
        System.out.println("Ingrese el valor de B :");
        B = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de C :");
        C = entrada.nextDouble();
        
        //Ecuacion de segundo grado
        
        DIS = Math.pow(B,2)-(4*A*C);
        
        ANS1 = (-B + Math.sqrt(DIS))/(2*A);
        ANS2 = (-B - Math.sqrt(DIS))/(2*A);       
        
        if (DIS>0){
           System.out.println("Las posibles soluciones son: "+ANS1+" y "+ANS2);
        }
        else if (DIS<0){
           System.out.println("No tiene solución en los reales"); 
        }
        else{
           System.out.println("La posibles soluciones es: "+ANS1);
                   }
        

    }
}
