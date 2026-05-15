/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Paralelogramo extends Cuadrilatero{
    private double base; //lado horizontal
    private double lado; //lado inclinado
    private double altura; //Es una línea recta invisible(perpendicular)desde el techo hasta el piso

    public Paralelogramo(double base, double lado, double altura, String color) {
        super(color);
        this.base = base;
        this.lado = lado;
        this.altura = altura;
    }
    //Getter
    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }
    //Setter

    public void setBase(double base) {
        this.base = base;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public double perimetro(){
        return 2*base + 2*lado;
    }
    @Override
    public double area(){
        return base*altura;
    }
    
    //toString

    @Override
    public String toString() {
        return "Paralelogramo{" + "base: " + base + ", lado: " + lado + ", altura: " + altura +", color: "+getColor()+'}';
    }
    
}
