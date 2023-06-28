/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciostema8;

/**
 *
 * @author gerar
 */
public class EjerciciosTema8 {

    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setEdad(14);
        p.setNombre("Gerardo");
        p.setTelefono(123456789);
        
        System.out.println("Hola "+p.getNombre()+" tu edad es: "+p.getEdad()+" tu numero de telefono "+p.getTelefono());
    }
}
