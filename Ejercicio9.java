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
public class Ejercicio9 {
    public static void main(String[] args) {
        
        System.out.println("ingrese su edad");
        Scanner Leer = new Scanner (System.in);
        int edad = Leer.nextInt();
        if(edad >= 18){
            System.out.println("usted es mayor de edad");
        }
        else{
            System.out.println("Usted es menor de edad");
            
            }
        }
    }
