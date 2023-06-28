/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotema9;

/**
 *
 * @author gerar
 */
public class Trabajador extends Persona {
    
    float salario;
    
    public Trabajador(int edad, String nombre, int telefono, float salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
    
}
