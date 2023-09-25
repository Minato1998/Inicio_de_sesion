/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author darwin12
 */
public class Personas {
    
    String nombre;
    String apellidos;
    String dni;
    int año_nacimiento;
    
    
    public Personas (String nombre,String apellidos,String dni, int año_nacimiento){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.año_nacimiento=año_nacimiento;
    
    }
    void imprimir(){
        System.out.println("nombre : " + nombre);
        System.out.println("apellidos : " + apellidos);
        System.out.println("dni : " + dni);
        System.out.println("año de nacimeinto : " +año_nacimiento );
        
    
    }
    
}
