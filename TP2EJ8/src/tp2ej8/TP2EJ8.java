/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ej8;

import java.util.Scanner;

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
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Codigo:");
        int codigo = teclado.nextInt();

        System.out.println("Clima (1-3):");
        int op = teclado.nextInt();
        ClimaEnum clima = null;

        switch(op){
           case 1 -> clima = ClimaEnum.TROPICAL;
           case 2 -> clima = ClimaEnum.TEMPLADO;
           case 3 -> clima = ClimaEnum.SECO;
        }
        Invernadero i = new Invernadero("A", 1, ClimaEnum.SECO);
    }
    
}
