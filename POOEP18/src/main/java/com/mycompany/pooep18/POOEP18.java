
package com.mycompany.pooep18;

import java.util.Scanner;


public class POOEP18 {
        public static void main(String[] args) {
        String COD;
        String NOM;
        int HM;
        double VT;
        double PR;
        double SB;
        double SR;
    
        Scanner entrada = new Scanner(System.in);       
        System.out.println("Ingrese codigo del empleado :");
        COD = entrada.next(); 
        
        System.out.println("Ingrese el nombre :");
        NOM = entrada.next(); 
        
        System.out.println("Ingrese el total de horas trabajadas al mes :");
        HM = entrada.nextInt(); 
        
        System.out.println("Ingrese el valor de hora :");
        VT = entrada.nextDouble(); 
        
        System.out.println("Ingrese el porcentaje de retención :");
        PR = entrada.nextDouble(); 
        
        SB = HM*VT;
        
        SR = SB*(1-(PR/100));
        
        System.out.println("El trabajador con codigo :"+ COD +" de nombre "+ NOM+ " tiene salario bruto de $"+ SB +" y salario neto $"+ SR);
 
        }
}      
