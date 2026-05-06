/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ej8;

//import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jazmín
 */
public class TP2EJ8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Codigo:");
        int codigo = teclado.nextInt();

        System.out.println("Clima (1.TROPICAL 2.TEMPLADO 3.SECO):");
        int op = teclado.nextInt();
        ClimaEnum clima = null;

        switch(op){
           case 1 -> clima = ClimaEnum.TROPICAL;
           case 2 -> clima = ClimaEnum.TEMPLADO;
           case 3 -> clima = ClimaEnum.SECO;
        }*/
        //Desde Main simula la emergencia. Instancia la finca y agrégale 3 invernaderos con capacidades distintas
        ArrayList<Invernadero> listaInv = new ArrayList<>();
        
        listaInv.add(new Invernadero("Inv1", 1, ClimaEnum.TROPICAL, 10)); //!!
        listaInv.add(new Invernadero("Inv2", 2, ClimaEnum.TEMPLADO, 10));
        listaInv.add(new Invernadero("Inv3", 3, ClimaEnum.SECO, 0));
        
        AdministradorFinca finca = new AdministradorFinca(listaInv);
        
        //crea un ArrayList local en el main con 5 Lotes de Siembra en peligro.
        ArrayList<LoteSiembra> lotesPeligro = new ArrayList<>();
         
        lotesPeligro.add(new LoteSiembra(2, "Platano", ClimaEnum.TROPICAL));
        lotesPeligro.add(new LoteSiembra(5, "Tomate", ClimaEnum.TROPICAL));
        lotesPeligro.add(new LoteSiembra(4, "Olivo", ClimaEnum.SECO));
        lotesPeligro.add(new LoteSiembra(7, "Trigo", ClimaEnum.TEMPLADO));
        lotesPeligro.add(new LoteSiembra(6, "Arroz", ClimaEnum.TEMPLADO));
         
        //Recorrer lista, obtenerMejorInvernadero() para buscar un refugio 
        for(int i=0; i<5; i++){
           LoteSiembra l=lotesPeligro.get(i);
           
           Invernadero inv = finca.obtenerMejorInvernadero(l.getClimaRequerido());
           if(inv != null){
               System.out.print("SALVADO! Lote " + l.getIdLote() + " de " + l.getEspecie());
               System.out.println("asignado a Invernadero " + inv.getNombre());
           }
           else{
               System.out.print("ALERTA! Lote " + l.getIdLote() + " de " + l.getEspecie());
               System.out.println(" sin refugio");
           }
           System.out.println(" ");
        }
    
    }
}
