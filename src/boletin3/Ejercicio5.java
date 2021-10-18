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
    public static void primoProgram(){
        int numUsuario = boletin3.utils.EntradaSalida.solicitarNumeroNatural("Inserte el número que quiere comprobar");
        System.out.println("El número " + numUsuario + " es primo? " + isPrimo(numUsuario));
        
    }
    
    public static boolean isPrimo(int n){
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
    
    public static boolean isPrimo2(int n){
        if(n % 2 == 0){
            return false;
        }
        int i;
        for(i = 3; n % i != 0 && i < n; i+=2){
            
        }
        return !(n % i == 0);
    }
}
