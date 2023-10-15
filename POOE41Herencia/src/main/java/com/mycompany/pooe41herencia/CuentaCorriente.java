/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooe41herencia;


public class CuentaCorriente extends Cuenta {

    float sobregiro;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa); // Invoca al constructor de la clase padre
        sobregiro = 0; // Inicialmente no hay sobregiro
    }

    @Override
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad; 
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } 
        else super.retirar(cantidad);
             
    }   
    @Override
    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        if (sobregiro > 0) {
            if ( residuo > 0) { 
                sobregiro = 0;
                saldo = residuo;
            } 
            else {
                sobregiro = -residuo;
                saldo = 0;}
        } 
        else {
               super.consignar(cantidad); }
    }
  
    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }
  
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sobregiro = $" + sobregiro);
        System.out.println();
    }
}

