/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_herencia;
import java.util.ArrayList;

/**
 *
 * @author Jazmín
 */
public class Animacion {
    String titulo;

    int duracionMin;
    int publicacion;
    
    double calificacion;
    IdiomaEnum idioma;
    boolean subtitulos;
    ArrayList<Favoritos> favorito;
    
    //CONSTRUCTOR
    public Animacion(){
    }
    public Animacion(String titulo, int duracionMin, int publicacion, IdiomaEum idioma, boolean subtitlos){
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.publicacion = publicacion;
        this.idioma = idioma;
        this.subtitulos = subtitlos;
    }
    
    public void agregarFvoritos(Animacion pelicula){
        favorito.add(this);
    }
    
    public boolean esPopular(Animacion pelicula){
        return pelicula.calificacion>=3.5;
    }
    
    public String informacion (){
        return "\nTitulo: " + titulo + "\nPublicacion: " + publicacion +
                "\ncalificacion: " + calificacion + "\nIdioma: " + idioma;
    }
    
    
    
    
}
