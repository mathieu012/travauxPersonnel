package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bonjour, voici mon programme de conversion");

        double nbr;
        double cal;
        int res = 0;
        int end = 1;
        Scanner sc = new Scanner(System.in);


        do{
            res = 0;
            System.out.println("Si vous voulez convertir des Celecius en Fahrenheit taper 1");
            System.out.println("Si vous voulez convertir des Fahrenheit en Celsius taper 2");

            while (res != 1 && res != 2) {
                res = sc.nextInt();
                if (res != 1 && res != 2) {
                    System.out.println("Votre chiffre ne correspond pas ! Ressaisissez-le ");
                }
                else
                    break;
                }
            System.out.println("Tapez votre nombre à convertir");

            nbr = sc.nextDouble();

            if(res == 1){
                cal = (9 / 5) * nbr + 32;
                System.out.println(cal + " Fahrenheit");
            }
            else{
                cal = ((nbr - 32) * 5) / 9;
                System.out.println(cal + "Celsius");
            }

            System.out.println("Voulez vous réaliser une autre conversion ? Si oui tapez : 1 sinon tapez : 2");

            end = sc.nextInt();


        }while(end == 1);

        System.out.println("Programme Fini");
    }

}




