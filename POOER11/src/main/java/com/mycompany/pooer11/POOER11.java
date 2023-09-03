
package com.mycompany.pooer11;

import java.util.Scanner;

public class POOER11 {
    public static void main(String[] args) {
        int N1;
        int N2;
        int N3;
        int MAYOR;
                
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero 1 :");
        N1 = entrada.nextInt();
        
        System.out.println("Ingrese el valor del numero 2 :");
        N2 = entrada.nextInt(); 
        
        System.out.println("Ingrese el valor del numero 3 :");
        N3 = entrada.nextInt(); 
        
        
        if ((N1 > N2) &&(N1 > N3)){
            MAYOR = N1;
        }
        else if ((N2 > N3)){
            MAYOR = N2;
        }
        else{
            MAYOR = N3;
        }
        
        System.out.println("El mayor valor entre "+ N1 + ", " + N2 +" y "+N3 + " es: "+MAYOR);
       
    }
    
}
