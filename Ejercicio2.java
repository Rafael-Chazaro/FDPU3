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
public class Ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero entero");
        Scanner Leer = new Scanner(System.in);
        int num1 = Leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = Leer.nextInt();
        if(num1 > num2) { 
            System.out.println("El primer numero es el mayor");
        } 
        if(num1 > num2){
            System.out.println("El segundo numero es el menor");
        }
    }
}
