/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasointegral6feb;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class RepasoIntegral6Feb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leerPersona = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = leerPersona.next();
        
        System.out.println("Domicilio: ");
        String domicilio = leerPersona.nextLine();
        
        System.out.println("DNI: ");
        String dni = leerPersona.next();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("DNI: " + dni);
    }
    
}
