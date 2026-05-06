package tp2ej8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jazmín
 */
public class LoteSiembra{
    private int idLote;
    private String especie;
    private ClimaEnum climaRequerido;
    
    private Invernadero invernaderoAsignado; //vinculacion
    
    //Const
    public LoteSiembra(int idLote, String especie, ClimaEnum climaRequerido){
    this.idLote = idLote;
    this.especie = especie;
    this.climaRequerido = climaRequerido;
    }
    
    //G
    public int getIdLote(){
        return idLote;
    }
    public String getEspecie(){
        return especie;
    }
    public ClimaEnum getClimaRequerido(){
        return climaRequerido;
    }
    
    //s
    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }
    public void setEspecie(String especie) {
    this.especie = especie;
    }
    
    public void setClimaRequerido(ClimaEnum climaRequerido){
       this.climaRequerido = climaRequerido;
    }

    //invernaderoAsignado GetSet
    public Invernadero getInvernaderoAsignado(){
        return invernaderoAsignado;
    }

    public void setInvernaderoAsignado(Invernadero invernaderoAsignado){
        this.invernaderoAsignado = invernaderoAsignado;
    }
    
}
