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
public class Boletin3 {

    public static void main(String[] args){
        //sumaParesProgram();
        //Ejercicio2.sumaNumerosProgram();
        
        Scanner teclado = new Scanner(System.in);
        String line;
        do{
            System.out.println("******************************************");
            System.out.println("* 1. Suma pares                          *");
            System.out.println("* 2. Suma números                        *");
            System.out.println("* 3. Sumar cifras número                 *");
            System.out.println("* 4. Tabla de multiplicar                *");
            System.out.println("* 5. Es primo                            *");
            System.out.println("* 6. Es primo (versión 2)                *");
            System.out.println("* 7. Calcular factorial                  *");
            System.out.println("*                                        *");
            System.out.println("* 0. Salir                               *");
            System.out.println("******************************************");
            line = teclado.nextLine();
            switch(line){
                case "1":
                    sumaParesProgram();
                    break;
                case "2":
                    Ejercicio2.sumaNumerosProgram();
                    break;
                case "3":
                    Ejercicio3.sumaCifrasProgram();
                    break;
                case "4":
                    Ejercicio4.tablaMultiplicarProgram();
                    break;
                case "5":
                    Ejercicio5.primoProgram(1);
                    break;
                case "6":
                    Ejercicio5.primoProgram(2);
                    break;
                case "7":
                    Ejercicio6.factorialProgram();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opción incorrecta!");
            }
        }while(!line.equals("0"));
      
    }
    
    public static void sumaParesProgram(){
        /*
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Por favor, inserte un número natural");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();
            }
            if(numUsuario < 0){
                System.out.println("ERROR: Debe insertar un número natural.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);*/
        //Esta línea se transforma en lo de arriba
        int numUsuario = boletin3.utils.EntradaSalida.solicitarNumeroNatural("Por favor, inserte un número natural");
        System.out.println("El resultado es: " + sumaPares(numUsuario));
    }
    
    public static int sumaPares(int n){
        if(n <= 20){
            if(n % 2 != 0){
                n++;
            }
            int resultado = 0;
            for(int i = n; n <= 20; i = i+2){
                resultado += i;
            }
            return resultado;
        }
        else{
            //Falta por hacer si es mayor
            if(n % 2 != 0){
                n--;
                n = n - 1;
            }
            int resultado = 0;
            for(int i = n; i >= 20; i -= 2){
                resultado += i;
            }
            return resultado;
        }
    }
    
}
