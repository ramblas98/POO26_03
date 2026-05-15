/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Rectangulo extends Cuadrilatero{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro(){
        return 2*base + 2*altura;
    }
    @Override
    public double area(){
        return base*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base: " + base + ", altura: " + altura + ", color: "+getColor()+ '}';
    }
    
    
}
