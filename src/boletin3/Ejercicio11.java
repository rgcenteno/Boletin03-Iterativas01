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
        if(numerosACalcular > 20){
            System.out.println("Con valores superiores a 20 el algoritmo puede tardar bastante\nCalculando...");
        }
        //Ahora ya podemos trabajar. Vamos a ir recorriendo números sucesivos hasta que encontremos los números que nos han solicitado.
        System.out.println(getPrimerosNumArmstrong(numerosACalcular));
    }
    
    /**
     * Calcula los primeros n números de Armstrong 
     * @param cuantos Cuantos números queremos calcular
     * @return String con los n primeros números de Armstrong
     */    
    private static String getPrimerosNumArmstrong(int cuantos){
        int encontrados = 0;
        String resultado = ""; //Aquí almacenaremos los números encontrados. Cuando conozcamos los arrays, éstos serán una opción mejor pero de momento usamos esto.
        long i;
        for(i = 1; encontrados < cuantos && i < Long.MAX_VALUE; i++){
            if(esArmstrong(i)){
                encontrados++;
                resultado += i + " ";
            }
        } 
        if(i == Long.MAX_VALUE){
            resultado += "\nNos hemos acabado los números sin encontrar más números de Armstrong";
        }
        return resultado;
    }
    
    /**
     * Devuelve el número de cifras que tiene un número
     * @param num Número del que queremos comprobar el número de cifras
     * @return Número de cifras que conforman el número.
     */
    private static int getNumCifras(long num){        
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
    private static boolean esArmstrong(long num){
        long resultado = 0;
        int numCifras = getNumCifras(num);
        for(int i = 1; i <= num; i = i*10){
            long cifra = (num / i) % 10;
            resultado += java.lang.Math.pow(cifra, numCifras);
        }
        return resultado == num;
    }
    
    
}
