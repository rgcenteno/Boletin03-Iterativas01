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
public class Ejercicio6 {
    
    public static void factorialProgram(){
        int numUsuario = -1;
        do{
            numUsuario = boletin3.utils.EntradaSalida.solicitarNumeroNatural("Inserte un número natural mayor que cero.");
        }
        while(numUsuario < 1);
        System.out.println(numUsuario + "! = " + calcularFactorial(numUsuario));
    }
    
    private static long calcularFactorial(int n){
        long resultado = 1;
        for (int i = n; i >= 1; i--){
            resultado = resultado * i;
        }
        return resultado;
    }
}
