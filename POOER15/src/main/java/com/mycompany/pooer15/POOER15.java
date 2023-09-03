
package com.mycompany.pooer15;


import java.util.Scanner;

public class POOER15 {
    public static void main(String[] args) {
        int PESOA;
        int PESOB;
        int PESOC;
        int PESOD;
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera A :");
        PESOA = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B :");
        PESOB = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera C :");
        PESOC = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera D :");
        PESOD = entrada.nextInt();
        
        if ((PESOA == PESOB) && (PESOA == PESOC)){
            System.out.println("La esfera D es la diferente");
            if (PESOD > PESOA){
                System.out.println("y es la de mayor peso" );
            }
            else{
                System.out.println("y es la de menor peso" );
            }
        }
        else if((PESOA == PESOB) && (PESOA == PESOD)){
             System.out.println("La esfera C es la diferente");
             if (PESOC > PESOA){
                System.out.println("y es la de mayor peso" );
                }
             else{
                System.out.println("y es la de menor peso" );
            }   
        }
        else if((PESOA == PESOC) && (PESOA == PESOD)){
             System.out.println("La esfera B es la diferente");
             if (PESOB > PESOA){
                System.out.println("y es la de mayor peso" );
                }
             else{
                System.out.println("y es la de menor peso" );
            }   
        }
        else {
            System.out.println("La esfera A es la diferente");
            if (PESOA > PESOB){
                System.out.println("y es la de mayor peso" );
                }
             else{
                System.out.println("y es la de menor peso" );
            }
        }
        
        }
       
        }
