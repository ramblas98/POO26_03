package Ejercicio_2;

public class Computadora {
    protected String procesador;
    protected int memoriaRam;
    protected float almacenamiento;
    private boolean botonDePrendido;

    public Computadora(){
        this.procesador = "AMD ryzen 7";
        this.memoriaRam = 16;
        this.almacenamiento = 512;
        Apagado();
    }

    public Computadora(String procesador, int memoria, float almacenamiento){
        this.procesador = procesador;
        this.memoriaRam = memoria;
        this.almacenamiento = almacenamiento;
        Apagado();
    }

    public void Encender(){
        this.botonDePrendido = true;
    }

    public void Apagado(){
        this.botonDePrendido = false;
    }
}
