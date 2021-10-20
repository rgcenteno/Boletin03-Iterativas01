/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

import java.util.Scanner;

/**
 *
 * @author rgcenteno
 */
public class Ejercicio11 {
    
    public static void numerosArmstrongProgram(){
        Scanner teclado = new Scanner(System.in);
        int numerosACalcular = -1;
        do{
            System.out.println("Inserte el número de números Armstrong a calcular");
            if(teclado.hasNextInt()){
                numerosACalcular = teclado.nextInt();
                if(numerosACalcular <= 0){
                    System.out.println("Debe solicitar al menos un año.");
                }
            }
            else{
                System.out.println("Debe insertar un número entero.");
            }
            teclado.nextLine();
        }
        while(numerosACalcular <= 0);
        
    }
    
    /**
     * Devuelve el número de cifras que tiene un número
     * @param num Número del que queremos comprobar el número de cifras
     * @return Número de cifras que conforman el número.
     */
    public static int getNumCifras(long num){        
        int longitud = 0;
        for(int i = 1; i <= num; i = i*10){
            longitud++;            
        }
        return longitud;
    }
    
    /**
     * Comprueba si un número es un número narcisista
     * @param num Número a comprobar
     * @return true si lo es, falso en otro caso
     */
    public static boolean esArmstrong(int num){
        int resultado = 0;
        int numCifras = getNumCifras(num);
        for(int i = 1; i <= num; i = i*10){
            int cifra = (num / i) % 10;
            resultado += java.lang.Math.pow(cifra, numCifras);
        }
        return resultado == num;
    }
    
    
}
