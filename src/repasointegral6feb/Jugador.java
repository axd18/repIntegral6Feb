/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasointegral6feb;

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
        this.puesto = puesto;
    }
}
