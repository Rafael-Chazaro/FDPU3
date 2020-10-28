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
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("ingrese el primer numero entero");
        Scanner Leer = new Scanner(System.in);
        int num1 = Leer.nextInt();
        System.out.println("ingrese el segundo numero entero");
        int num2 = Leer.nextInt();
        System.out.println("ingrese el tercer numero entero");
        int num3 = Leer.nextInt();
        
        //Si num1 es -menor-a num2 y num1 es - menor - a num3
        
        if(num1 < num2 && num1 < num3){
        System.out.println("El primer numero es menor");
            
        }else if (num2 < num1 && num2 < num3){
        System.out.println("El segundo numero es menor");
        
        }else if (num3 < num1 && num3 < num2){
        System.out.println("El tercer numero es menor");
        
        }else{
        System.out.println("Los tres numeros son iguales");
        
        }
    }
}
