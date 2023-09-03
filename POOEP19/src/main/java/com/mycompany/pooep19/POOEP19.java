

package com.mycompany.pooep19;


import java.util.Scanner;
public class POOEP19 {
    public static void main(String[] args) {
        
        double LADO;
        double PERIMETRO;
        double ALTURA;
        double AREA;
        
        Scanner entrada = new Scanner(System.in);       
        System.out.println("Ingrese el valor del lado :");
        LADO = entrada.nextInt(); 
        
        PERIMETRO = 3*LADO;
        
        ALTURA = (Math.sqrt(3)*LADO)/2;
        
        AREA = (Math.sqrt(3)*Math.pow(LADO,2))/4;
                
        System.out.println("El triangulo tiene de perimetro :"+ PERIMETRO +" con altura "+ ALTURA + " y area "+ AREA);

    }
}