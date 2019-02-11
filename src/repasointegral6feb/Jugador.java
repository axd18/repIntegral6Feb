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
public class Jugador extends Persona {
    public String puesto;

    public Jugador(String nombre, String direccion, String dni, String puesto) {
        super(nombre, direccion, dni);
        this.puesto = puesto;
        nombre = "Adrian";
        direccion = "Av. Independencia";
        dni = "29257290";
        puesto = "base";
    }
    
   
    
    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(String puesto){
        if (puesto.equals("base") || puesto.equals("escolta") || puesto.equals("alero") || puesto.equals("alero") || puesto.equals("pivot"));
            this.puesto = puesto;
    }
    
    public String leerJugador(Persona persona){
        return (super.leerPersona(persona)+this.puesto);
    }
    
    public void escribirJugador(){
        Scanner escribirPersona = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = escribirPersona.next();
        
        System.out.println("Domicilio: ");
        String domicilio = escribirPersona.nextLine();
        
        System.out.println("DNI: ");
        String dni = escribirPersona.next();
        
        System.out.println("puesto: ");
        String puesto = escribirPersona.next();
    }

    public String operadorUno(Persona persona){
        return (super.leerPersona(persona)+this.puesto);
    }
    
    public String operadorDos(Persona persona){
        return (super.leerPersona(persona)+this.puesto);
    }


}



