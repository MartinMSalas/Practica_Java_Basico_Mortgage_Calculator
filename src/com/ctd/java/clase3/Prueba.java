package com.ctd.java.clase3;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la cantidad de numeros primos que desea imprimir: ");
        int cantidadPrimos = scanner.nextInt();

        System.out.print("Los primeros "+cantidadPrimos+" numeros primos son: ");

        Integer d = 0;
        for(Integer c=2; d<cantidadPrimos; c++ ){
            if(esDivisible(c)){
                System.out.print(c+" ");
                d++;
            }
        }
    }
    public static boolean esDivisible(int n){

        boolean resultado = true;
        for (Integer i = 2; i<n; i++){
            if ((n%i)==0){
                resultado=false;
            }
        }
        return resultado;
    }

}

