package Ejercicio_2;

public class Computadora {
    protected String procesador;
    protected int memoriaRam;
    protected float almacenamiento;

    public Computadora(){
        this.procesador = "AMD ryzen 7";
        this.memoriaRam = 16;
        this.almacenamiento = 512;
    }

    public Computadora(String procesador, int memoria, float almacenamiento){
        this.procesador = procesador;
        this.memoriaRam = memoria;
        this.almacenamiento = almacenamiento;
    }

    
}
