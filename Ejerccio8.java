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
public class Ejerccio8 {
    public static void main(String[] args) {
        System.out.println("Seleciona una de las siguientes opciones del menu");
        System.out.println("1 - Calcular el area de un triangulo");
        System.out.println("2 - Calcular el area de un rectangulo");
        System.out.println("3 - Calcular al area de un circulo");
        Scanner Leer = new Scanner(System.in);
        int opcion = Leer.nextInt();
        switch(opcion) {
            case 1:
                // Calcular el area de un trianguloa a = base * altura / 2
                System.out.println("ingrese la base de triangulo");
                double baseT = Leer.nextDouble();
                System.out.println("ingrese la altura del trangulo");
                double alturaT = Leer.nextDouble();
                double areaT = (baseT * alturaT) / 2;
                System.out.println("El area del triangulo es:"+ areaT);
                break;
            case 2:
                System.out.println("Ingrese la altura del rectangulo");
                double baseR = Leer.nextDouble();
                System.out.println("Ingrese la altura del rectangulo");
                double alturaR = Leer.nextDouble();
                double areaR = baseR * alturaR;
                System.out.println("El area del rectangulo es:"+ areaR);
                break;
            case 3:
                System.out.println("Ingrese el radio del circulo");
                double radio = Leer.nextDouble();
                double areaC = Math.PI * (Math.pow(radio, 2));
                System.out.println("El area del circulo es:"+ areaC);
            break;
        }
    }
}
