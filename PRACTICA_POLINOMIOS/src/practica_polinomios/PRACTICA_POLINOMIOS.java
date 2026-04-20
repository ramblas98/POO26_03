/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_polinomios;

/**
 *
 * @author Jazmín
 */
import java.util.Scanner;
import java.util.Arrays;

public class PRACTICA_POLINOMIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int[] Polinomio = {};
        //Polinomio p = new Polinomio();

        int indicador=0;
        int nuevo, i=0;
        while (indicador == 0){
            nuevo=teclado.nextInt(); 
            Polinomio = Arrays.copyOf(Polinomio, Polinomio.length + 1);
            Polinomio[i]=nuevo;
            i++;
            //p.agregarCoef(nuevo);
            indicador=teclado.nextInt();
        }
        
        for (i=0; i < Polinomio.length; i++) {
            System.out.println(Polinomio [i]);
         }
        
        //RESTA
        int menorRESTA;
        nt[] sumaP = {};
        if(P1.lenght<P2.length){
            menor=P1.length;
        }
        else{
            menor=P2.length;
        }
        for (i=0; i < Polinomio.length; i++) {
            restaP = Arrays.copyOf(restaP, restaP.length + 1);
            restaP[i]=P1[i] + P2[i];
         }
        
        //SUMA
        int mayorSUMA;
        nt[] sumaP = {};
        if(P1.lenght>P2.length){
            mayor=P1.length;
        }
        else{
            mayor=P2.length
        }
        for (i=0; i < Polinomio.length; i++) {
            sumaP = Arrays.copyOf(sumaP, sumaP.length + 1);
            sumaP[i]=P1[i] + P2[i];
         }
    }
}


