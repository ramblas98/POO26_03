/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Isosceles extends Triangulo{
    private double ladoIgual;
    private double base;

    public Isosceles(double ladoIgual, double base, String color) {
        super(color);
        this.ladoIgual = ladoIgual;
        this.base = base;
    }
    
    //Getter
    public double getLadoIgual() {
        return ladoIgual;
    }

    public double getBase() {
        return base;
    }
    
    //Setter
    public void setLadoIgual(double ladoIgual) {
        this.ladoIgual = ladoIgual;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double getAltura(){
        return Math.sqrt(Math.pow(ladoIgual, 2)-Math.pow(base/2, 2));
    }
    
    @Override
    public double perimetro(){
        return 2*ladoIgual+base;
    }
    
    @Override
    public double area(){
        return base*getAltura()/2;
    }

    @Override
    public String toString() {
        return "Triangulo isosceles{" + "ladoIgual: " + ladoIgual + ", base: " + base + ", color: "+getColor()+'}';
    }
    
    
}
