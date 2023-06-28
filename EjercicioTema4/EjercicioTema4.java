/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotema4;

/**
 *
 * @author gerar
 */
public class EjercicioTema4 {

    public static void main(String[] args) {
        int numeroIf = 3;
        if(numeroIf < 0){
            System.out.println("Negativo");
        }else if(numeroIf > 0){
            System.out.println("Positivo");
        }else{
            System.out.println(0);
        }
        
        int numeroWhile = 0;
        
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        
        int numeroDoWhile = 0;
        
        do {
            numeroDoWhile++;
            
            System.out.println(numeroDoWhile); 
        } while (numeroDoWhile < 3);
        
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor); 
        }
        
        String estacion = "verano"; 

        switch (estacion) {
            case "primavera":
                System.out.println("La estación actual es primavera.");
                break;
            case "verano":
                System.out.println("La estación actual es verano.");
                break;
            case "otoño":
                System.out.println("La estación actual es otoño.");
                break;
            case "invierno":
                System.out.println("La estación actual es invierno.");
                break;
            default:
                System.out.println("El valor de la variable estacion no corresponde a una estación.");
                break;
        }
    }
}
