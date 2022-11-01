/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casosprueba;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CasosPrueba {

    public static String GenerarPalabra() {
        //La variable palabra almacena el resultado final
        String palabra = "";
        //La longitud de la palabra la decidimos al azar
        int longitud = (int) (Math.random() * 9) + 1;
        //Generamos palabra
        for (int i = 0; i < longitud; i++) {
            int codigoAscii = (int) Math.floor(Math.random() * (122
                    - 97) + 97);

            //para pasar el código a carácter basta con hacer un cast a char
            palabra = palabra + (char) codigoAscii;
        }
        return palabra;
    }
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Introduce el número de palabras que quieres que aparezcan: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("La palabra generada es: " + GenerarPalabra() + 1 + " " + GenerarPalabra() + 2 + " " + GenerarPalabra() + 3 + " " + GenerarPalabra() + 4);
        }

        teclado.close();

    }
}

