/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3.utils;

import java.util.Scanner;

/**
 *
 * @author rgcenteno
 */
public class EntradaSalida {
    public static int solicitarNumeroNatural(String peticion){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println(peticion);
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();
            }
            if(numUsuario < 0){
                System.out.println("ERROR: Debe insertar un número natural.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);
        return numUsuario;
    }
}
