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
        
        nombre = "Adrian";
        direccion = "Av. Independencia";
        dni = "29257290";
        
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
    
    
    public String leerPersona(){
        System.out.println("Ingrese un dato: ");
        Scanner leerPersona = new Scanner(System.in);
        
        
        if (leerPersona.equals(nombre) && leerPersona.equals(direccion) && leerPersona.equals(dni)){
           return this.nombre + this.direccion + this.dni;
        }
      
        return null;
    }
    
    
    
    public void escribirPersona(){
        Scanner escribirPersona = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = escribirPersona.next();
        
        System.out.println("Domicilio: ");
        String domicilio = escribirPersona.nextLine();
        
        System.out.println("DNI: ");
        String dni = escribirPersona.next();
        
    }

    String leerPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
