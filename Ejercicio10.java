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
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("ingrese su edad:");
        Scanner Leer = new Scanner(System.in);
        int edad = Leer.nextInt();
        String mensaje = "";
        //1 - 11 NIÑO
        if(edad <= 11) {
            mensaje = "Es NIÑO";
        }
        //12 - 17 Adolescente
        else if(edad <= 17) {
            mensaje = "Es adolescente";
        }
        //18 - 29 joven
        else if(edad <= 29) {
            mensaje = "Es joven";
        }
        //30 - 45 adulto
        else if(edad <= 45) {
            mensaje = "Es adulto";
        }
        //46 - 59 adulto maduro
        else if(edad <= 59) {
            mensaje = "Es adulto maduro";
        }
         //60 - 69 adulto mayor
        else if(edad <= 69) {
            mensaje = "Es adulto mayor";
        }
        //70 - 100 anciano
        else if(edad <= 100) {
            mensaje = "Es anciano";
        }
        System.out.println(mensaje);
    }
}
