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
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner Leer = new Scanner (System.in);
        int numero = Leer.nextInt();
        if(numero > 100){
            System.out.println("El numero ingresado es mayor a 100");
        }
    }
}
