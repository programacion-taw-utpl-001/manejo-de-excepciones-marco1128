/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semananueve;

import java.util.Locale;

/**
 *
 * @author BVB09
 */
public class Asignacion {
    Estudiante [] estudiante;
    double [] notasMate;
    double [] notasSociales;

    public Asignacion(Estudiante[] estudiante, double[] notasMate, double[] notasSociales) {
        this.estudiante = estudiante;
        this.notasMate = notasMate;
        this.notasSociales = notasSociales;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    public double[] getNotasMate() {
        return notasMate;
    }

    public void setNotasMate(double[] notasMate) {
        this.notasMate = notasMate;
    }

    public double[] getNotasSociales() {
        return notasSociales;
    }

    public void setNotasSociales(double[] notasSociales) {
        this.notasSociales = notasSociales;
    }
    public double promedio_estudiante(int n){
         double promedio=0;
        
            promedio+= getNotasSociales()[n];
            promedio+= getNotasMate()[n];
        
        
        return promedio/2;
    }
     public double PromedioMate(){
        double total=0;
        for (int i = 0; i < getNotasMate().length; i++) {
            total+= getNotasMate()[i];
        }
        return total/this.getEstudiante().length;
    }
    
    public double PromedioSociales(){
        double total=0;
        for (int i = 0; i < getNotasSociales().length; i++) {
            total+= getNotasSociales()[i];
        }
        return total/this.getNotasSociales().length;
    }
     @Override
    public String toString(){
        String cadena="";
        for (int i = 0; i < getEstudiante().length; i++) {
            cadena+=String.format("%s\n"
                    + "\tMatematica: %.2f\n"
                    + "\tSociales: %.2f\n"
                    + "\tPromedio: %.2f\n\n",estudiante[i].toString(),notasMate[i],notasSociales[i],promedio_estudiante(i));
        }
        
        return String.format("%s\n"
                + "Promedio General\n"
                + "Promedio Matematicas : %.2f\n"
                + "Promedio Sociales : %.2f\n", cadena,PromedioMate(),PromedioSociales());
    }
    
    
    

   
    
}
