/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasointegral6feb;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
    
    public Arraylist escribirEquipo(){
        for (int jugador : vectorJugadores){
            return jugador;
        }
        return null;
        
    }
}
