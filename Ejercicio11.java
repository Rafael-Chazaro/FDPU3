/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdpu3;

import java.util.Scanner;

/**
 *
 * @author solic
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 10:");
        Scanner Leer = new Scanner (System.in);
        int num = Leer.nextInt();
        String nombre = "";
        switch(num){
            case 1:
                nombre = "Uno";
                break;
            case 2:
                nombre = "Dos";
                break;
            case 3:
                nombre = "Tres";
                break;
            case 4:
                nombre = "Cuatro";
                break;
            case 5:
                nombre = "Cinco";
                break;
            case 6:
                nombre = "Seis";
                break;
            case 7:
                nombre = "siete";
                break;
            case 8:
                nombre = "Ocho";
                break;
            case 9:
                nombre = "Nueve";
                break;
            case 10:
                nombre = "Diez";
                break;
        }
        System.out.println(nombre);
    }
}