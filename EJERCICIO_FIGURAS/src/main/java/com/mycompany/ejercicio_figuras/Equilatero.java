/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Equilatero extends Triangulo{
    private double lado;
    
    //Cosntructor
    public Equilatero(double lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    //Getter
    public double getLado() {
        return lado;
    }
    
    //Setter
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double getAltura(){
        return 0.866*lado;
    }
    
    @Override
    public double perimetro(){
        return lado*3;
    }
    
    @Override
    public double area(){
        return lado*getAltura()/2;
    }
    
    //toString
    @Override
    public String toString() {
        return "Triangulo equilatero{" + "lado:" + lado + ", color: "+getColor()+'}';
    }
    
}
