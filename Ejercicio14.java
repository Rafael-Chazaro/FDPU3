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
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Ingrese el primer numero");
        Scanner Leer = new Scanner(System.in);
        int inicio= Leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int fin = Leer.nextInt();
        while(inicio <= fin){
            System.out.println(inicio);
            inicio++;
        }
    }
    
}
