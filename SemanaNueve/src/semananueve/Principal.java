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
public class Principal {
    public static void main(String[] args) {
        int contador = 0;
        String nombre;
        String apellido;
        Scanner entrada = new Scanner (System.in).useDelimiter("\n");
        Estudiante [] lista = new Estudiante [4];
        double [] notasMate = new double[4];
        double [] notasSociales = new double [4];
        
        while (contador < 4){
            try{
                System.out.println("Ingrese nombre:");
                nombre = entrada.next();
                System.out.println("Ingrese el apellido");
                apellido = entrada.next();
                System.out.println("Ingrese la nota de Matematica");
                notasMate [contador]= Double.parseDouble(entrada.next());
                System.out.println("Ingrese la nota de socilaes:");
                notasSociales[contador] = Double.parseDouble(entrada.next());
                
               lista [contador]= new Estudiante(nombre, apellido);
               contador ++; 
               
             } catch (NumberFormatException numberFormatException) {
                System.err.println("No se puede poner letras en notas!");
            }catch (Exception e){
                
            }
            
        }
        
        Asignacion  as = new Asignacion (lista, notasMate, notasSociales);
        System.out.println(as);
    }
    
}
