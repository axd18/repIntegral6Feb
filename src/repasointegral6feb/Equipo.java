/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasointegral6feb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Equipo {

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

   
    private String nombreEquipo;
    private int numeroJugadores;
    private int vectorJugadores [];
    
    
    public Equipo(String nombreEquipo, int numeroJugadores){
        this.nombreEquipo = nombreEquipo;
        this.numeroJugadores = numeroJugadores;
        ArrayList<String> vectorJugadores = new ArrayList<>();
    }
    
    public Object escribirEquipo(){
        for (Object jugador : vectorJugadores){
            return jugador;
        }
        return null;
        
    }
    
    public void leerEquipo(){
        ArrayList vectorJugadores = new ArrayList<>();
        Scanner leerEquipo = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = leerEquipo.next();
        vectorJugadores.add(nombre);
        
        System.out.println("Domicilio: ");
        String domicilio = leerEquipo.nextLine();
        vectorJugadores.add(domicilio);
        
        System.out.println("DNI: ");
        String dni = leerEquipo.next();
        vectorJugadores.add(dni);
        
        System.out.println("puesto: ");
        String puesto =  leerEquipo.next();
        vectorJugadores.add(puesto);
    }
}
