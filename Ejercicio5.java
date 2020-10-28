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
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero del  1 al 7");
        Scanner Leer = new Scanner(System.in);
        int numero = Leer.nextInt();
        String dia = "";
        switch(numero){
            
            case 1:
                dia = "lunes";
                break;
                
                case 2:
                dia = "martes";
                break;
                
                case 3:
                dia = "miercoles";
                break;
                
                case 4:
                dia = "jueves";
                break;
                
                case 5:
                dia = "viernes";
                break;
                
                case 6:
                dia = "sabado";
                break;
                
                case 7:
                dia = "domingo";
                break;
                
        }
        System.out.println(dia);
    }
}
