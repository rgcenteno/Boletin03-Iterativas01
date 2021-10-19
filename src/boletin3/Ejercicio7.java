/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

import static boletin3.Boletin3.sumaParesProgram;
import java.util.Scanner;

/**
 *
 * @author rgcenteno
 */
public class Ejercicio7 {
    
    public static void fibonacciProgram(){
        Scanner teclado = new Scanner(System.in);
        int penultimo = 0;
        int ultimo = 1;
        String salida = penultimo + ", " + ultimo;
        System.out.println(salida);
        String line;
        do{
            System.out.println("******************************************");
            System.out.println("* 1. Calcular siguiente número           *");
            System.out.println("* 2. Salir                               *");
            System.out.println("******************************************");
            line = teclado.nextLine();
            switch(line){
                case "1":
                    int sig = ultimo + penultimo;
                    salida += ", " + sig;
                    penultimo = ultimo;
                    ultimo = sig;
                    System.out.println(salida);
                    break;
                case "2":                    
                    break;                
                default:
                    System.out.println("Opción incorrecta!");
            }
        }while(!line.equals("2"));
    }
}
