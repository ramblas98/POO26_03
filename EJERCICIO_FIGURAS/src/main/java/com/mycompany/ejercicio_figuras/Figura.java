/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Figura {
    private String color;

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }
    
    //Getter
    public String getColor() {
        return color;
    }
    
    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    public double perimetro(){
        return 0.0;
    }
    
    public double area(){
        return 0.0;
    }
    
    //toString
    @Override
    public String toString() {
        return "Figura{" + "color=" + color + '}';
    }
    
}
