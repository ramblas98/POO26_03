package Ejercicio_2;

public class Servidor extends Computadora{
    protected int fuentesDePoder;
    protected int cantidadDeTorres;

    public Servidor(){
        super();
        super.asignarSistemaOperativo(SistemaOPerativo.REDHAT);
        this.fuentesDePoder = 32;
        this.cantidadDeTorres = 10;
    }

    public Servidor(int fuentesDePoder, int cantidadDeTorres){
        super();
        super.asignarSistemaOperativo(SistemaOPerativo.REDHAT);
        this.cantidadDeTorres = cantidadDeTorres;
        this.fuentesDePoder = fuentesDePoder;
    }

    public Servidor(int fuentesDePoder, int cantidadDeTorres, String procesador, int memoria, float almacenamiento){
        super(procesador,memoria,almacenamiento);
        super.asignarSistemaOperativo(SistemaOPerativo.REDHAT);
        this.cantidadDeTorres = cantidadDeTorres;
        this.fuentesDePoder = fuentesDePoder;
    }
}
