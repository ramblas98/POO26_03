/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Escaleno extends Triangulo{
    private double lado1;
    private double lado2;
    private double ladoBase;
    
    public Escaleno(double lado1, double lado2, double ladoBase, String color) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.ladoBase = ladoBase;
    }
    
    @Override
    public double getAltura(){
        double a = area();
        return 2*a/ladoBase;
    }
    
    @Override
    public double perimetro(){
        return lado1+lado2+ladoBase;
    }
    
    @Override
    public double area(){
        double s = (lado1+lado2+ladoBase)/2; //SEMIPERIMETRO
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-ladoBase));
    }

    @Override
    public String toString() {
        return "Triangulo escaleno{" + "lado1: " + lado1 + ", lado2: " + lado2 + ", ladoBase: " + ladoBase + ", color: "+getColor()+ '}';
    }
    
    
}
