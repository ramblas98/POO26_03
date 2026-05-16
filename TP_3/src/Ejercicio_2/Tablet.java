package Ejercicio_2;

public class Tablet extends Portatil{
    private boolean panelTactil;
    private boolean soporteDeLapiz;

    public Tablet(){
        super();
        this.panelTactil = true;
        this.soporteDeLapiz = false;
    }

    public Tablet(boolean panelTactil, boolean soporteDeLapiz){
        super();
        super.asignarSistemaOperativo(SistemaOPerativo.ANDROID);
        this.panelTactil = panelTactil;
        this.soporteDeLapiz = soporteDeLapiz;
    }

    public Tablet(int bateria, float tamanoDePantalla,boolean panelTactil, boolean soporteDeLapiz,SistemaOPerativo os){
        super(bateria,tamanoDePantalla);
        super.asignarSistemaOperativo(os);
        this.panelTactil = panelTactil;
        this.soporteDeLapiz = soporteDeLapiz;
    }

}
