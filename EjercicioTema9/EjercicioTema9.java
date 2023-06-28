/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotema9;

/**
 *
 * @author gerar
 */
public class EjercicioTema9 {

    public static void main(String[] args) {
        Cliente c = new Cliente(1 , "Gerardo", 2 ,3);
        Trabajador t = new Trabajador(1, "Gerardo", 2, 3);
        
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Edad: "+c.getEdad());
        System.out.println("Telefono: "+c.getTelefono());
        System.out.println("Credito: "+c.getCredito());
        
        System.out.println("Salario: "+t.getSalario());
    }
}
