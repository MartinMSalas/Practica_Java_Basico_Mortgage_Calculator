package com.ctd.java.clase3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        challenge1();
        challenge2();
        challenge3();
        challenge4();


    }

    private static void challenge4() {
        /*Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
        horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
        trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
        programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
        hora semanal es de 875.
¡Ahora es tu turno!*/
        String employeeName = "Julieta";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of worked hours by the employee "+employeeName+": ");
        double workedHours= scanner.nextDouble();
        double hourlyWage = 875;
        double overtimeWage = hourlyWage * 1.5;
        double salary = salaryCalculation(workedHours, hourlyWage, overtimeWage);
        System.out.println("The salary of "+employeeName+" for this week is: "+salary);
//        if (salary< 999999){
//            System.out.println("please raise the salary of "+employeeName+" you know that the dev deserve it ");
//        }
    }

    private static double salaryCalculation(double workedHours,double hourlyWage, double overtimeWage) {
        double salary = 0;
        if (workedHours<=40)
            salary= workedHours * hourlyWage;
        else
            // more than 40 worked hours in a week
            salary = 40 * hourlyWage + (workedHours -40) * overtimeWage;

        return salary;
    }

    private static void challenge1(){
        /*Desafío 1
        Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
        aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
        en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
        una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
        devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
        cuando el primero elije “*” como indicador de final.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first player name: ");
        String player1=scanner.nextLine();
        System.out.print("Enter second player name 2: ");
        String player2=scanner.nextLine();

        String playOne = "";
        String playTwo = "";
        int pointsPlayer1=0;
        int pointsPlayer2=0;


        while (!playOne.equals("*")){
            System.out.println("Entre player 1 play: ");
            playOne=scanner.nextLine();
            System.out.println("Entre player 2 play: ");
            playTwo=scanner.nextLine();
            int result=cualGana(playOne,playTwo);
            if(result==1) {
                pointsPlayer1++;
            }else if(result==2){
                pointsPlayer2++;
            }
            System.out.println("Points player 1: "+pointsPlayer1);
            System.out.println("Points player 2: "+pointsPlayer2);
        }

        winnerPrinter(player1,player2,pointsPlayer1,pointsPlayer2);


    }
    static int cualGana(String playOne, String playTwo){
        int result=0;
        //rock scissors paper
        if(playOne.equals("rock")){
            if(playTwo.equals("rock")){
                result=0;
            } else if (playTwo.equals("scissors")) {
                result=1;
            } else if (playTwo.equals("paper")){
                result=2;
            }
        }else if(playOne.equals("scissors")){
            if(playTwo.equals("rock")){
                result=2;
            } else if (playTwo.equals("scissors")) {
                result=0;
            } else if (playTwo.equals("paper")){
                result=1;
            }
        }else if(playOne.equals("paper")){
            if(playTwo.equals("rock")){
                result=1;
            } else if (playTwo.equals("scissors")) {
                result=2;
            } else if (playTwo.equals("paper")){
                result=0;
            }
        }

        return result;
    }

    private static void challenge2(){
/*

        Desafío 2
        Modificá la función cualGana del Desafío 1 para jugar la variante Spock: Hay una
        posibilidad más, el señor Spock —formado por la mano Vulcana de Star Trek— tiene otros
        poderes según:
        Papel desaprueba Spock
        Spock destroza tijeras
        Spock vaporiza piedra
*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first player name: ");
        String player1=scanner.nextLine();
        System.out.print("Enter second player name 2: ");
        String player2=scanner.nextLine();

        String playOne = "";
        String playTwo = "";
        int pointsPlayer1=0;
        int pointsPlayer2=0;


        while (!playOne.equals("*")){
            System.out.println();
            System.out.println("Enter player 1 play: ");
            playOne=scanner.nextLine();
            System.out.println("Enter player 2 play: ");
            playTwo=scanner.nextLine();
            int result=cualGana2(playOne,playTwo);
            if(result==1) {
                pointsPlayer1++;
            }else if(result==2){
                pointsPlayer2++;
            }
            System.out.println();
            System.out.println("Points player 1: "+pointsPlayer1);
            System.out.println("Points player 2: "+pointsPlayer2);
        }
        winnerPrinter(player1,player2,pointsPlayer1,pointsPlayer2);



    }
    static int cualGana2(String playOne, String playTwo){
        int result=0;
        //rock scissors paper
        if(playOne.equals("rock")){
            if(playTwo.equals("rock")){
                result=0;
            } else if (playTwo.equals("scissors")) {
                result=1;
            } else if (playTwo.equals("paper")){
                result=2;
            } else if(playTwo.equals("spock")){
                result=2;
            }
        }else if(playOne.equals("scissors")){
            if(playTwo.equals("rock")){
                result=2;
            } else if (playTwo.equals("scissors")) {
                result=0;
            } else if (playTwo.equals("paper")){
                result=1;
            }   else if(playTwo.equals("spock")){
                result=2;
            }
        }else if(playOne.equals("paper")){
            if(playTwo.equals("rock")){
                result=1;
            } else if (playTwo.equals("scissors")) {
                result=2;
            } else if (playTwo.equals("paper")){
                result=0;
            } else if(playTwo.equals("spock")){
                result=1;
            }
        }else if(playOne.equals("spock")){
            if(playTwo.equals("rock")){
                result=1;
            } else if (playTwo.equals("scissors")) {
                result=1;
            } else if (playTwo.equals("paper")){
                result=2;
            } else if(playTwo.equals("spock")){
                result=0;
            }
        }

        return result;
    }

    static void winnerPrinter(String playerOneName, String playerTwoName, int pointsOne, int pointsTwo){
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();
        if(pointsOne>pointsTwo){
            System.out.println("The winner is: "+playerOneName);
        }else if(pointsOne==pointsTwo){
            System.out.println("There is a Draw !! want a rematch? ");
        } else if (pointsOne<pointsTwo) {
            System.out.println("The winner is: "+playerTwoName);
        }

    }

    private static void challenge3(){
        /*Implementar un programa que nos permite mostrar por consola los primeros “n” números
        primeros, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
        que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13,
                17”.*/
        int primeArray[] = {

                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
                211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
                331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443,
                449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541};

        Scanner scanner = new Scanner(System.in);
        int quantity= 0;
        while (true){

            System.out.print("How many prime numbers do you need?: ");
            quantity = scanner.nextInt();
            if(quantity<=100 && quantity>0){
                break;
            }
            System.out.println("Please choose a quantity between 1 and 100");
        }

        for (int i = 0; i < quantity;i++){
            System.out.print(primeArray[i]+" ");
        }



    }

}
