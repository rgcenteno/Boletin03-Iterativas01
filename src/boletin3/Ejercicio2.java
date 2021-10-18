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
public class Ejercicio2 {
    
    public static void sumaNumerosProgram(){
        int numUsuario = boletin3.utils.EntradaSalida.solicitarNumeroNatural("Por favor inserte un número entero");
        System.out.println("El resultado es: " + sumaNumeros(numUsuario));        
    }
    
    public static int sumaNumeros(int n){
        int resultado = 0;
        for(int i = 1; i <= n; i++){
            resultado += i; //resultado = resultado + i;
        }
        return resultado;
    }
}
