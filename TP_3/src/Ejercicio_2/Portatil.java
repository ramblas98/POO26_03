package Ejercicio_2;

public class Portatil extends Computadora{
    protected int bateria;
    protected float tamanoPantalla;

    public Portatil(){
        super();
        this.bateria = 5000;
        this.tamanoPantalla = 1980;
    }

    public Portatil(int bateria, float tamanoPantalla){
        super();
        super.asignarSistemaOperativo(SistemaOPerativo.WINDOWS10);
        this.bateria = bateria;
        this.tamanoPantalla = tamanoPantalla;
    }

    public Portatil(int bateria, float tamanoPantalla, String procesador, int memoriaRam, float almacenamiento, SistemaOPerativo os){
        super(procesador,memoriaRam,almacenamiento);
        super.asignarSistemaOperativo(os);
        this.bateria = bateria;
        this.tamanoPantalla = tamanoPantalla;
    }
}
