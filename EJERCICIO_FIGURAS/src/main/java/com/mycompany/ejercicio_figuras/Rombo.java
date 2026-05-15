/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class Rombo extends Cuadrilatero{
    private double lado;
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double lado, double diagonalMayor, double diagonalMenor, String color) {
        super(color);
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    
    //Getter
    public double getLado() {
        return lado;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    
    //Setter
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    
    
    @Override
    public double perimetro(){
        return 4*lado;
    }
    @Override
    public double area(){
        return (diagonalMayor*diagonalMenor)/2;
    }

    @Override
    public String toString() {
        return "Rombo{" + "lado: " + lado + ", diagonalMayor: " + diagonalMayor + ", diagonalMenor: " + diagonalMenor + ", color: "+getColor()+'}';
    }
    
    
}
