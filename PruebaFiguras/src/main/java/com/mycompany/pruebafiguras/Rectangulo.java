/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author melis
 */
public class Rectangulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo
    /**
    * Constructor de la clase Rectangulo
    * @param base Parámetro que define la base de un rectángulo
    * @param altura Parámetro que define la altura de un rectángulo
    */
    Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    /**
    * Método que calcula y devuelve el área de un rectángulo como la
    * multiplicación de la base por la altura
    * @return Área de un rectángulo
    */
    double calcularArea() {
    return base * altura;
    }
    /**
    * Método que calcula y devuelve el perímetro de un rectángulo
    * como (2 * base) + (2 * altura)
    * @return Perímetro de un rectángulo
    */
    double calcularPerimetro() {
    return (2 * base) + (2 * altura);
    }
    
}
