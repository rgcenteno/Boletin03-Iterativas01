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
public class Ejercicio3 {
    public static void sumaCifrasProgram(){
        int numUsuario = boletin3.utils.EntradaSalida.solicitarNumeroNatural("Inserte el número del que quiere sumar sus cifras");
        System.out.printf("Suma de las cifras de %d es %d\n", numUsuario, sumaCifrasWhile(numUsuario));
    }
    
    public static int sumaCifras(int n){
        int resultado = 0;
        for(int i = 1; i <= n; i = i*10){
            int cifra = (n / i) % 10;
            resultado = resultado + cifra;
        }
        return resultado;
    }
    
    public static int sumaCifrasWhile(int n){
        int resultado = 0;
        while(n > 0){
            resultado += n % 10;
            n /= 10;
        }
        return resultado;
    }
}
