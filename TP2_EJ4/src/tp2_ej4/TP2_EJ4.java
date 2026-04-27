/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej4;
import java.util.Scanner;
/**
 *
 * @author Jazmín
 */
public class TP2_EJ4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int grado1 = teclado.nextInt();
        int grado2 = teclado.nextInt();
        Polinomio p1 = new Polinomio(grado1);//crea
        p1.ingresarPolinomio();//llenar
        Polinomio p2 = new Polinomio(grado2);
        p2.ingresarPolinomio();
        
        for (int i = 0; i <= p1.getGrado(); i++){
            System.out.println("x ^" + i + p1.getCoeficiente(i));
        }
        for (int i = 0; i <= p2.getGrado(); i++){
            System.out.println("x ^" + i + p2.getCoeficiente(i));
        }
        
        int seguir, opc , instancia, estatico, otros;
        do{
            System.out.println("Elija una opcion");
            System.out.println("1. Metodos de instancia");
            System.out.println("2. Metodos Estaticos");
            System.out.println("3. Usat otros metodos");
            opc=teclado.nextInt();
            switch(opc){
                case 1 -> {
                    System.out.println("Elija una opcion");
                    System.out.println("1. Sumar Polinomios");
                    System.out.println("2. Restar Polinomios");
                    System.out.println("3. Multiplicar Polinomios");
                    System.out.println("4. Dividir Polinomios");
                    instancia=teclado.nextInt();
                    switch(instancia){
                        case 1 -> p1.suma(p2);
                        case 2 -> p1.resta(p2);
                        case 3 -> p1.multiplicar(p2);
                        case 4 -> {
                            Polinomio div=p1.division(p2);
                            div.mostrar();
                        }
                    }
                }

                case 2 -> {
                    System.out.println("Elija una opcion");
                    System.out.println("1. Sumar Polinomios");
                    System.out.println("2. Restar Polinomios");
                    System.out.println("3. Multiplicar Polinomios");
                    System.out.println("4. Dividir Polinomios");
                    estatico=teclado.nextInt();
                    switch(estatico){
                        case 1 -> {
                            Polinomio sEst = Polinomio.sumaEst(p1, p2);
                            sEst.mostrar();
                        }
                        case 2 -> {
                            Polinomio rEst = Polinomio.restaEst(p1, p2);
                            rEst.mostrar();
                        }
                        case 3 -> {
                            Polinomio mEst = Polinomio.multEst(p1, p2);
                            mEst.mostrar();
                        }
                        case 4 -> {
                            Polinomio dEst = Polinomio.divEst(p1, p2);
                            dEst.mostrar();
                        }
                    }
                }

                case 3 -> {
                    System.out.println("Elija una opcion");
                    System.out.println("1. Evaluar");
                    System.out.println("2. Derivar");
                    System.out.println("3. Integrar");
                    System.out.println("4. Calcular raices (0, 1, 2)");
                    System.out.println("5. toString");
                    System.out.println("6. Equals");
                    otros=teclado.nextInt();
                    switch(otros){
                        case 1 -> {
                            System.out.println("Ingresar valor de X");
                            double x = teclado.nextDouble();
                            double resultado = p1.evaluar(x);
                            System.out.println(resultado);
                        }
                        case 2 -> {
                            Polinomio derivado=p1.derivar();
                            derivado.mostrar();
                        }
                        case 3 -> {
                            Polinomio integrado=p1.integrar();
                            integrado.mostrar();
                        }
                        case 4 -> {
                            double[] r= p1.calcularRaices();
                            if(r!=null){
                                for (int i = 0; i <= r.length; i++){
                                    System.out.println("raiz: " + r[i]);
                                }
                            }
                            else{
                                System.out.println("No hay raices reales");
                            }
                        }
                        case 5 -> System.out.println(p1.toString());
                        //case 6 -> {
                        //}
                    }
                }

            }
            System.out.println("Seguir?  1.Si 0.No");
            seguir=teclado.nextInt();
        }while(seguir!=0);
        
    }
    
}
