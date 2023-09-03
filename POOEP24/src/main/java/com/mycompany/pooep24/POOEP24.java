
package com.mycompany.pooep24;

import java.util.Scanner;
public class POOEP24 {

    public static void main(String[] args) {
        double PESOA;
        double PESOB;
        double PESOC;
            
            
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A :");
        PESOA = entrada.nextDouble(); 
        
        System.out.println("Ingrese el valor de B :");
        PESOB = entrada.nextDouble(); 
        
        System.out.println("Ingrese el valor de C :");
        PESOC = entrada.nextDouble(); 
        
        if ((PESOA > PESOB) && (PESOA > PESOC)){
            System.out.println("La esfera de mayor peso es la esfera A");
        }    
        else if ((PESOB > PESOA) && (PESOB > PESOC)){
            System.out.println("La esfera de mayor peso es la esfera B");    
                    }
        else{
            System.out.println("La esfera de mayor peso es la esfera C"); 
            }

    }
}
