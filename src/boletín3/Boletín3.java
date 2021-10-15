/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín3;

import java.util.Scanner;

/**
 *
 * @author rgcenteno
 */
public class Boletín3 {

    public static void main(String[] args){
        sumaParesProgram();
    }
    
    public static void sumaParesProgram(){
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
        }while(numUsuario < 0);
        
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
            return 0;
        }
    }
    
}
