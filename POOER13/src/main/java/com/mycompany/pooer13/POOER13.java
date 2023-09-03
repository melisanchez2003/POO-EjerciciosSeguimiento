
package com.mycompany.pooer13;

import java.util.Scanner;

public class POOER13 {
        public static void main(String[] args) {  
              
              int VALCOMP;
              double VALPAG;
              double PDES;
              String COLOR;
              
              Scanner entrada = new Scanner(System.in);
        
              System.out.println("Ingrese el valor de la compra :");
              VALCOMP = entrada.nextInt();

              System.out.println("Ingrese el color :");
              COLOR = entrada.next();


              if(COLOR.equals("BLANCO")){
                  PDES = 0;
              }
              else if (COLOR.equals("VERDE")){
                  PDES = 10;
              }
              else if (COLOR.equals("AMARILLO")){
                  PDES = 25;
                }
              else if (COLOR.equals("AZUL")){
                  PDES = 50;
               }
              else{
                  PDES = 100;
                }
              VALPAG = VALCOMP - (PDES*VALCOMP)/100;

              System.out.println("El cliente debe pagar $" + VALPAG );
               
        }
        
}
