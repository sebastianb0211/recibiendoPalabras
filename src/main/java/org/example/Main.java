package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        int contadorMalas=0;
        int contadorBuenas=0;
        int cantidadPalabras=0;
        int I=0;
        String palabra;

        System.out.print("ingrese cuantas palabras quiere ingresar: ");
        cantidadPalabras= teclado.nextInt();

        while (cantidadPalabras>I){

            System.out.print("ingrese una palabra: ");
            palabra= teclado.next();

            if (palabra.length()>=8){
                contadorBuenas++;
            }else {
                contadorMalas++;
            }
            I++;
        }
        System.out.println("la cantidad de palabaras buenas son: "+contadorBuenas);
        System.out.println("y la cantida de palabras malas son: "+contadorMalas);

        }
}