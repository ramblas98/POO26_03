package tp2ej8;


import java.util.ArrayList;
import tp2ej8.ClimaEnum;
import tp2ej8.Invernadero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jazmín
 */
public class AdministradorFinca {
    private final ArrayList<Invernadero> listaFiltrada;
    
    public AdministradorFinca(ArrayList<Invernadero> listaFiltrada){
        this.listaFiltrada=listaFiltrada;
    }
    //G
    public ArrayList<Invernadero> getListaFiltrada(){
        return listaFiltrada;
    }
    
    
    public Invernadero obtenerMejorInvernadero(ClimaEnum c){
        int mayorDisponibilidad = -1;
        int indicador = -1;
        for (int i=0; i<listaFiltrada.size(); i++){
            if(listaFiltrada.get(i).getClima() == c ){
                if(listaFiltrada.get(i).getDisponible() > mayorDisponibilidad){
                    mayorDisponibilidad=listaFiltrada.get(i).getDisponible();
                    indicador=i;
                }
            }
        }
        if(indicador != -1){
            return listaFiltrada.get(indicador);
        }
        else{
            return null;
        }
    }
}
