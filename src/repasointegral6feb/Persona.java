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
public class Persona {
    private String nombre;
    private String direccion;
    private String dni;
    
    public Persona(String nombre, String direccion, String dni){
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    
}
