/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciostema3;

/**
 *
 * @author gerar
 */
public class EjerciciosTema3 {

    public static void main(String[] args) {
        Coche coche = new Coche();
        
        int puertas = coche.incrementarNumeroPuertas(3);
        
        System.out.println(puertas);
        
        int resultado = 0;
        resultado = suma(1,2,3);
        System.out.println(resultado);
    }
    
    public static int suma(int param1, int param2, int param3){
        return param1 + param2 + param3;
    }
}