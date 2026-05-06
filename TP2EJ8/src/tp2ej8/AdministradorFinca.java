package tp2ej8;
import java.util.ArrayList;

/**
 *
 * @author Jazmín
 */
public class AdministradorFinca {
    private final ArrayList<Invernadero> listaFinca;
    
    public AdministradorFinca(ArrayList<Invernadero> listaFinca){
        this.listaFinca=listaFinca;
    }
    //G
    public ArrayList<Invernadero> getListaFinca(){
        return listaFinca;
    }
    
    
    public Invernadero obtenerMejorInvernadero(ClimaEnum c){
        int mayorDisponibilidad = 0;
        int indicador = -1;
        for (int i=0; i < listaFinca.size(); i++){
            if(listaFinca.get(i).getClima() == c ){ // !!!
                if(listaFinca.get(i).getDisponible() > mayorDisponibilidad){
                    mayorDisponibilidad=listaFinca.get(i).getDisponible();
                    indicador=i;
                }
            }
        }
        if(indicador != -1){
            return listaFinca.get(indicador);
        }
        else{
            return null;
        }
    }
}
