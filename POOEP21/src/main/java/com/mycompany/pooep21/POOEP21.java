
package com.mycompany.pooep21;

import java.util.Scanner;


public class POOEP21 {
    public static void main(String[] args) {
        
        double LADO1;
        double LADO2;
        double LADO3;
        double PERIMETRO;
        double SEMIPERIMETRO;
        double AREA;
        
        Scanner entrada = new Scanner(System.in);       
        System.out.println("Ingrese el valor del lado :");
        LADO1 = entrada.nextDouble(); 
        
        System.out.println("Ingrese el valor del lado :");
        LADO2 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado :");
        LADO3 = entrada.nextDouble();
        
        PERIMETRO = LADO1 + LADO2 + LADO3;
        
        SEMIPERIMETRO = PERIMETRO/2;
        
        //Formula de Herón
        
        AREA = Math.sqrt(SEMIPERIMETRO * (SEMIPERIMETRO - LADO1) * (SEMIPERIMETRO - LADO2) * (SEMIPERIMETRO - LADO3));
                
        System.out.println("El triangulo tiene de perimetro :"+ PERIMETRO +" con semiperimetro "+ SEMIPERIMETRO +" y area " +AREA);

    }
}