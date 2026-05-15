/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    //Getter
    public double getRadio() {
        return radio;
    }
    
    //Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
    
    @Override
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    //toString
    @Override
    public String toString() {
        return "Circulo{" + "radio: " + radio + ", Color: "+getColor() +'}';
    }
    
}
