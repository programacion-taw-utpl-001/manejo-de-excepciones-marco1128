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
public class SemanaNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner entrada =  new Scanner (System.in);
        
        System.out.println("Ingrese su edad");
        edad =  entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingrese su nombre");
        nombre = entrada.nextLine();
       
        
        System.out.printf("Su nombre es: %s\n", nombre);   
        System.out.printf("Su edad es: %d", edad);
    }
    
}
