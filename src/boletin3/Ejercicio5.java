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
public class Ejercicio5 {
    public static void primoProgram(int version){
        int numUsuario = boletin3.utils.EntradaSalida.solicitarNumeroNatural("Inserte el número que quiere comprobar");
        if(version == 1){
            System.out.println("El número " + numUsuario + " es primo? " + isPrimo(numUsuario));
        }
        else{
            System.out.println("El número " + numUsuario + " es primo? " + isPrimo2(numUsuario)+ " (versión 2)");
        }
        
    }
    
    /**
     * Un número es primo cuando además de ser divisible por 1 y por si mismo, es divisible por <b>cualquier otro número entero</b>.
     * Vamos a comprobar si el número que nos da el usuario (llamemosle n) es divisible por algún número de los que hay entre 2 y el número introducido por el usuario. Si encontramos un
     * por el que podamos dividir n con resto igual a cero entonces el número no es primo. Si comprobamos todos los números y no encontramos ningún divisor, devolvemos true;
     * @param n Número que queremos testear si es primo o no
     * @return true si es primo, falso en otro caso
     */
    private static boolean isPrimo(int n){
        if(n % 2 == 0){
            return false;
        }
        for(int i = 3; i < n; i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Otra forma de hacerlo, en vez de hacer un if cambiamos la condición de permanencia. Dejamos de recorrer el bucle si hemos encontrado un divisor o si n >= i.
     * En la última línea comprobamos porque hemos salido. Si hemos salido porque n == i entonces es que no hemos encontrado un divisor. En caso contrario, hemos encontrado
     * un divisor y el número NO es primo.
     * @param n Número a testear
     * @return true si es primo, falso en otro caso
     */
    private static boolean isPrimo2(int n){
        if(n % 2 == 0){
            return false;
        }
        int i;
        for(i = 3; n % i != 0 && i < n; i+=2){
            
        }
        return i == n;
    }
}
