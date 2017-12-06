/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semananueve;

import java.util.Scanner;

/**
 *
 * @author BVB09
 */
public class Division {
    public static int cociente (int numerador , int denominador)
       throws ArithmeticException
    {
        return numerador/ denominador;
    }        
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
            int  numerador;
            int denominador;
            boolean bandera = true;
        do {
        try{
                System.out.println("Ingrese el numerador");
                numerador = teclado.nextInt();
                System.out.println("Ingrese el denominador");
                denominador = teclado.nextInt();
                int resultado = cociente (numerador, denominador);
                System.out.printf("\nLa respuesta es:%d / %d = %d\n ",numerador, denominador, resultado);
        }catch(ArithmeticException e){
            System.err.println("No se peude dividor para 0");
        }
         } while (bandera);
    }
    
}
