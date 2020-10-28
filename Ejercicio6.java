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
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 - 12");
        Scanner Leer = new Scanner(System.in);
        int numero = Leer.nextInt();
        String mes = "";
        switch(numero){ 
            
                case 1:
                mes = "Enero";
                break;
                
                case 2:
                mes = "Febrero";
                break;
                
                case 3:
                mes = "Marzo";
                break;
                
                case 4:
                mes = "Abril";
                break;
                
                case 5:
                mes = "Mayo";
                break;
                
                case 6:
                mes = "Junio";
                break;
                
                case 7:
                mes = "Julio";
                break;
                
                case 8:
                mes = "Agosto";
                break;
                
                case 9:
                mes = "Septiembre";
                break;
                
                case 10:
                mes = "Octubre";
                break;
                
                case 11:
                mes = "Noviembre";
                break;
                
                case 12:
                mes = "Diciembre";
                break;   
               
        }
        
        System.out.println(mes);
    }
}
