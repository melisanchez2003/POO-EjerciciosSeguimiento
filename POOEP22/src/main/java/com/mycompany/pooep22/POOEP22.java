/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep22;

import java.util.Scanner;

public class POOEP22 {

    public static void main(String[] args) {
        String NOM;
        int SAL;
        int HM;
        int SALT;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado :");
        NOM = entrada.next();
        
        System.out.println("Ingrese el salario por hora :");
        SAL = entrada.nextInt();
        
        System.out.println("Ingrese el numero de horas trabajadas :");
        HM = entrada.nextInt();
        
        SALT = SAL*HM;
        
        if (SALT > 450000){
            System.out.println("El trabajador : "+NOM+" tiene un salario de "+ SALT );
        }
        else{
            System.out.println("El trabajador tiene como nombre : "+NOM);
 
    }
    }
}
