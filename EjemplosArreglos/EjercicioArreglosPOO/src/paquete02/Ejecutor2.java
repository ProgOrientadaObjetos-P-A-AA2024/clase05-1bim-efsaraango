/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;
/**
 *
 * @author Det-Pc
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10,9,8,10};
        String nombreEstudiante = "Rene Elizalde";
        
        LibretaCalificacion cali1 = new LibretaCalificacion(nombreEstudiante, notas);
        // me saldra 0 y null por q no estoy llamando al metodo establacerPromedio() y al 
        //establecerPromedioCualitativo() dara null por defecto.
        cali1.establecerPromedio();
        cali1.establecerPromedioCualitativo();
        
        System.out.printf(" %s\n", cali1 );
    }
}
