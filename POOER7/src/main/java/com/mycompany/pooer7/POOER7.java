
package com.mycompany.pooer7;

import java.util.Scanner;

public class POOER7 {
    public static void main(String[] args) {
        int A;
        int B;
                
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de A :");
        A = entrada.nextInt();
        
        System.out.println("Ingrese el valor de B :");
        B = entrada.nextInt(); 
        
        
        if (A > B){
            System.out.println("A es mayor que B" );
        }
        else if (A == B){
             System.out.println("A igual que B" );
            }
        else{
             System.out.println("A es menor que B" );
                }
                
    }
}
