package Ejercicio_2;

public class LaptopGamer extends Portatil{
    private String tarjetaGrafica;
    private boolean modoAltorendimiento;
    private Refrigeracion tipoDeRefrigeracion;

    public LaptopGamer(){
        super();
        this.tarjetaGrafica = "Nvidia RTX 3070 TI";
        this.tipoDeRefrigeracion = Refrigeracion.VENTILADOR;
        this.modoAltorendimiento = false;
    }

    public LaptopGamer(String tarjetaGrafica, Refrigeracion tipoDeRefrigeracion){
        super();
        this.tarjetaGrafica = tarjetaGrafica;
        this.tipoDeRefrigeracion = tipoDeRefrigeracion;
        this.modoAltorendimiento = false;
    }

    public LaptopGamer(String tarjetaGrafica, Refrigeracion tipoDeRefrigeracion, int bateria, float
                       tamanoDePantalla){
        super(bateria,tamanoDePantalla);
        super.asignarSistemaOperativo(SistemaOPerativo.CACHYOS);
        this.tarjetaGrafica = tarjetaGrafica;
        this.tipoDeRefrigeracion = tipoDeRefrigeracion;
        this.modoAltorendimiento = false;
    }

    public LaptopGamer(String tarjetaGrafica, Refrigeracion tipoDeRefrigeracion, int bateria, float
            tamanoDePantalla,String procesador,int memoria,float almacenamiento,SistemaOPerativo os){
        super(bateria,tamanoDePantalla,procesador,memoria,almacenamiento,os);
        this.tarjetaGrafica = tarjetaGrafica;
        this.tipoDeRefrigeracion = tipoDeRefrigeracion;
        this.modoAltorendimiento = false;
    }
    /*Modo Gamer, el usuario manda un aviso si quiero activar el modo alto rendimiento,
     donde este activa la tarjeta de video para jugar y usa toda su capacidad*/

}
