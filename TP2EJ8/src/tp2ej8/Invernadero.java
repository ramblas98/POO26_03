/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej8;

/**
 *
 * @author Jazmín
 */
public class Invernadero {
    String nombre;
    int codigo;
    ClimaEnum clima;
    int capacidadMaxima=5;
    ArrayList<LoteSiembra> lote;
    
    
    //CONSTRUCTORES
    public Invernadero(String nombre){ //recibe
        this.nombre = nombre; // ASIGNA lo recibido al atributo del objeto
    }
    public Invernadero(int codigo){ //recibe
        this.codigo = codigo;
    }
    public Invernadero(ClimaEnum clima){ //recibe
        this.clima = clima;
    }
    public Invernadero(){ //recibe
        this.capacidadMaxima = 5;
    }
    
    //GETs
    public String getNombre(String nombre){
        return nombre;  // DEVUELVE
    }
    public int getCodigo(int numero){
        return numero;  // DEVUELVE
    }
    public ClimaEnum getClima(ClimaEnum clima){
        return clima;  // DEVUELVE
    }
    public int getCapacidadMaxima(int capacidadMaxima){
        return capacidadMaxima;  // DEVUELVE
    }
   
    public int getDisponible(){
        int tamActual = lote.size();
        int diferencia=capacidadMaxima - tamActual;
        
        return diferencia;
    }
    
    //  ):
    public void Invernadero(){
        //agregar
    }      
            
            
    
    //met
    public void agregarNuevoLote(ArrayList<LoteSiembra> lote){
        LoteSiembra nuevoLote = new LoteSiembra();
        nuevoLote.idLote(lote.size());
        nuevoLote.
        lote.add(nuevoLote);
    }
    
   
}
