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
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("ingresa una calificacion de 0 - 10");
        Scanner Leer = new Scanner(System.in);
        int Calificacion = Leer.nextInt();
        if(Calificacion >= 7){
            System.out.println("El alumno aprobo");
        }
        else{
            System.out.println("El alumno reprobo");
        }
    }
}
