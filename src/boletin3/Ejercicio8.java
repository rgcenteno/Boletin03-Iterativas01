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
public class Ejercicio8 {
    
    public static void inversionProgram(){       
        Scanner teclado = new Scanner(System.in);
        double inversion = -1;
        do{
            System.out.println("Inserte la cantidad a invertir");
            if(teclado.hasNextDouble()){
                inversion = teclado.nextDouble();
                if(inversion <= 0){
                    System.out.println("Debe invertir algún dinero.");
                }
            }
            else{
                System.out.println("Debe insertar un número entero.");
            }
            teclado.nextLine();
        }
        while(inversion <= 0);
        //Ahora solicitamos los años de inversión y comprobamos que sean 1 o más
        int anos = -1;
        do{
            System.out.println("Inserte los años que mantendrá el dinero invertido");
            if(teclado.hasNextInt()){
                anos = teclado.nextInt();
                if(inversion <= 0){
                    System.out.println("Debe invertir al menos un año.");
                }
            }
            else{
                System.out.println("Debe insertar un número entero.");
            }
            teclado.nextLine();
        }
        while(inversion <= 0);
        System.out.printf("Ganará %.2f€ con una inversión de %d años.\n", calcularGanancia(inversion, anos), anos);
    }
    
    private static double calcularGanancia(double inversionInicial, int anos){
        double inversionAcumulada = inversionInicial;
        int mesesInversion = anos * 12;
        final double interesMensual = 0.02 / 12; //Recordad que el 2% es un porcentaje por lo tanto es igual a 2/100 = 0.02
        for(int i = 1; i <= mesesInversion; i++){
            inversionAcumulada += (inversionAcumulada * interesMensual); 
        }
        return inversionAcumulada - inversionInicial;
    }
}
