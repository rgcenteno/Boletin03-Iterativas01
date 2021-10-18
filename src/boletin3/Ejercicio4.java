/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author rgcenteno
 */
public class Ejercicio4 {
    public static void tablaMultiplicarProgram(){
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Inserte un número entre 1 y 10");
            if(teclado.hasNextInt()){
                numUsuario = teclado.nextInt();
            }
            if(numUsuario < 1 && numUsuario > 10){
                System.out.println("ERROR: Debe insertar un número entre 1 y 10.\n");
            }
            teclado.nextLine();
        }
        while(numUsuario < 1 || numUsuario > 10);
        
    }
    
    public static String tablaMultiplicar(int n){
        //for
        return "";
    }
}
