/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej8;

import java.util.ArrayList;

/**
 *
 * @author Jazmín
 */
public class Invernadero {
    String nombre;
    int codigo;
    ClimaEnum clima;
    int capacidadMaxima;
    ArrayList<LoteSiembra> lotes;
        
    //CONSTRUCTORES
    public Invernadero(String nombre, int codigo, ClimaEnum clima, int capacidadMaxima){ //recibe
        this.nombre = nombre; // ASIGNA lo recibido al atributo del objeto
        this.codigo = codigo;
        this.clima = clima;
        this.capacidadMaxima = capacidadMaxima;
        this.lotes = new ArrayList<>();
    }
    //LoteSiembra nuevoLote = new LoteSiembra();
    
    
    //GETs
    public String getNombre(){
        return nombre;  // DEVUELVE
    }
    public int getCodigo(){
        return codigo;  // DEVUELVE
    }
    public ClimaEnum getClima(){
        return clima;  // DEVUELVE
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;  // DEVUELVE
    }
    
    public int getDisponible(){
        int tamActual = lotes.size();
        return capacidadMaxima - tamActual;
    }

    public void asignarLote(LoteSiembra lote){
        if(lotes.size()<capacidadMaxima){
            lotes.add(lote); //agregar nuevo lote a la lista
            lote.setInvernaderoAsignado(this); //actualizo referencia
        }
    }
}
