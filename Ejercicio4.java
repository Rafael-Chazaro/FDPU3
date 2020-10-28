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
public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("ingresa un numero entero positivo");
        Scanner Leer = new Scanner(System.in);
        
        int numero = Leer.nextInt();
        if(numero <= 9){
            System.out.println("el numero es de 1 cifra");
        }
        else if(numero <= 99 ){
            System.out.println("El numero es de 2 cifras");
        
        }
        
        else if(numero <= 999) {
            System.out.println("El numero es de 3 cifras");
        }
        
        else if(numero <= 9999) {
            System.out.println("el numero es de 4 cifras");
        }
        
        
    }
}
