
package com.mycompany.pooer10;

import java.util.Scanner;

public class POOER10 {
      public static void main(String[] args) {  
        int NI;
        String NOM;
        int PAT;
        int ES;
        double PAGMAT;
          
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de inscripción :");
        NI = entrada.nextInt();
        
        System.out.println("Ingrese el nombre :");
        NOM = entrada.next();
        
        System.out.println("Ingrese el patrimonio :");
        PAT = entrada.nextInt();
        
        System.out.println("Ingrese el estrato social :");
        ES = entrada.nextInt();
        
        PAGMAT = 50000;
        
       if ((PAT > 2000000) && (ES > 3 )){ 
           PAGMAT = PAGMAT + 0.03*PAT;
       }
       System.out.println("El estudiante con número de inscripción :" + NI + ", y nombre "+ NOM + ", debe pagar $" +PAGMAT);
       }

}