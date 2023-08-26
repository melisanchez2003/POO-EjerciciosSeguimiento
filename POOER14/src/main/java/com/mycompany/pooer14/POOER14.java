
package com.mycompany.pooer14;

/**
 *
 * @author melis
 */

import java.util.Scanner; 

public class POOER14 {

    // Ejercicio resuelto 14
    // Melisa Sanchez Zuluaga

    public static void main(String[] args) {
        // definción de variables

        double vd1, vd2, vd3, salar; // ventas por departamento y el salario de los vendedores, datos de entrada
        double totven, porven, salar1, salar2, salar3 ; // datos calculados a partir de lo ingresado
  
        
        // lectura de datos
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese ventas del departamento 1");
        vd1 = entrada.nextDouble(); // ventas departamento 1
        
        System.out.println("Ingrese ventas del departamento 2");
        vd2= entrada.nextDouble(); // ventas departamento 2
        
        System.out.println("Ingrese ventas del departamento 3");
        vd3= entrada.nextDouble(); // ventas departamento 3
        
        System.out.println("Salario de los vendedores");
        salar= entrada.nextDouble(); // salario de vendedores
        
        totven= vd1 + vd2 + vd3; // suma de las ventas por departamento, total de ganancias
        porven=totven*0.33; // el 33% de las ganancias totales
   
        if (vd1>porven){
            salar1=salar+salar*0.2; // cálculo del salario si las ventas fueron superiores al 33% de las ventas totales
        }
        else {
             salar1=salar; // cálculo del salario si no cumplen la condición
        }
        
        if (vd2>porven){
            salar2=salar+salar*0.2; // cálculo del salario si las ventas fueron superiores al 33% de las ventas totales
        }
        else {
             salar2=salar; // cálculo del salario si no cumplen la condición
        }
  
        if (vd3>porven){
            salar3=salar+salar*0.2; // cálculo del salario si las ventas fueron superiores al 33% de las ventas totales
        }
        else {
             salar3=salar; // cálculo del salario si no cumplen la condición
        }
        
       System.out.println("Salario vendedores departamento 1: " + salar1); 
       System.out.println("Salario vendedores departamento 2: " + salar2);
       System.out.println("Salario vendedores departamento 3: " + salar3);
    }
}
