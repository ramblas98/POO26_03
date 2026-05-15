/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_figuras;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO_FIGURAS {

    public static void main(String[] args) {
        //CIRCULO
        Circulo c1 = new Circulo(5,"Rojo");
        System.out.println(c1);
        System.out.println("Perimetro: "+String.format("%.2f",c1.perimetro()));
        System.out.println("Area: "+String.format("%.2f", c1.area()));
        
        //TRIANGULO EQUILATERO
        Equilatero t1 = new Equilatero(3,"Azul");
        System.out.println(t1);
        System.out.println("Perimetro: "+String.format("%.2f",t1.perimetro()));
        System.out.println("Area: "+String.format("%.2f",t1.area()));
        
        // TRIANGULO ISOSCELES
        // Lados iguales: 5, Base: 6, Altura: 4
        Isosceles t2 = new Isosceles(5, 6, "Verde");
        System.out.println(t2);
        System.out.println("Perimetro: " + String.format("%.2f", t2.perimetro()));
        System.out.println("Area: " + String.format("%.2f", t2.area()));

        // TRIANGULO ESCALENO
        // Lados: 3, 4 y 5 (Forman un triángulo rectángulo perfecto, área fácil de calcular)
        Escaleno t3 = new Escaleno(3, 4, 5, "Amarillo");
        System.out.println(t3);
        System.out.println("Perimetro: " + String.format("%.2f", t3.perimetro()));
        System.out.println("Area: " + String.format("%.2f", t3.area()));

        // RECTANGULO
        // Base: 6, Altura: 4
        Rectangulo r1 = new Rectangulo(6, 4, "Naranja");
        System.out.println(r1);
        System.out.println("Perimetro: " + String.format("%.2f", r1.perimetro()));
        System.out.println("Area: " + String.format("%.2f", r1.area()));

        // ROMBO
        // Lado: 5, Diagonal Mayor: 8, Diagonal Menor: 6
        Rombo rom1 = new Rombo(5, 8, 6, "Violeta");
        System.out.println(rom1);
        System.out.println("Perimetro: " + String.format("%.2f", rom1.perimetro()));
        System.out.println("Area: " + String.format("%.2f", rom1.area()));

        // PARALELOGRAMO
        // Base: 6, Lado Inclinado: 5, Altura: 4
        Paralelogramo p1 = new Paralelogramo(6, 5, 4, "Gris");
        System.out.println(p1);
        System.out.println("Perimetro: " + String.format("%.2f", p1.perimetro()));
        System.out.println("Area: " + String.format("%.2f", p1.area()));
    }
}
