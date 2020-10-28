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
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Ingrese el primer numero");
        Scanner Leer = new Scanner(System.in);
        double num1 = Leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = Leer.nextDouble();
        System.out.println("Selecione una de las siguientes opciones (1-4)");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        int opcion = Leer.nextInt();
        double resultado = 0;
        switch(opcion){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
        }
        System.out.println(resultado);
    }
    
}
