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
    public String nombre;
    public String direccion;
    public String dni;
    
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
    
    public void setNombre(){
        this.nombre = nombre;
    }
    
    public void setDireccion(){
        this.direccion = direccion;
    }
    
    public void setDni(){
        this.dni = dni;
    }
    
    public String leePersona(String nombre, String direccion, String dni){
        Scanner leePersona = new Scanner(System.in);
        System.out.println("Escriba su nombre: " + nombre);
        System.out.println("Escriba su direccion: "+ direccion);
        System.out.println("Escriba su dni: "+ dni);
        
        return nombre = leePersona.nextLine();
   
    }
}
