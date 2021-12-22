package com.last;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola benvingut/da al casino");
        float saldo=0;
        menuPrincipal(saldo);
    }
    public static void menuPrincipal(float saldo){
        int opcio = 0;
        System.out.println("Opciones:\n 1-Ingressar diners\n 2-Comprovar saldo\n 3-Retirar \n 4-Jocs \n 5-Sortir");
        opcio = entero();

        switch (opcio) {
            case 1:
                System.out.println("Introdueix la quantitat a ingressar: ");
                float inc=flot();
                saldo=saldo+inc;
                System.out.println("");
                menuPrincipal(saldo);
                break;
            case 2:
                System.out.println("Tu saldo es: "+saldo);
                System.out.println("");
                menuPrincipal(saldo);
                break;
            case 3:
                System.out.println("Introdueix la quantitat a retirar: ");
                float ret=flot();
                saldo=saldo-ret;
                System.out.println("");
                menuPrincipal(saldo);
                break;
            case 4:
                System.out.println("");
                submenu(saldo);
                break;
            case 5:
                System.out.println("Sortint del programa... ");
                break;
            default:
                System.out.println("ERROR: Opció no vàlida!");
                menuPrincipal(saldo);
                break;
        }
    }
    public static void submenu(float saldo){
        int opcio = 0;
        System.out.println("Opciones:\n 1-Ruleta\n 2-Dos\n 3-Tres \n 4-Cuatro \n 5-Cinco");
        opcio = entero();
        switch (opcio) {
            case 1:
                ruleta(saldo);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("ERROR: Opció no vàlida!");
                menuPrincipal(saldo);
                break;
        }
    }
    public static int entero(){
        Scanner input = new Scanner(System.in);
        int valor=0;
        boolean valorCorrecte=false;
        do {
            valorCorrecte = input.hasNextInt();

            if (!valorCorrecte) {
                System.out.println("Error! Valor incorrecte");
                input.nextLine();
            } else {
                valor = input.nextInt();
                input.nextLine();
            }
        } while (!valorCorrecte);
        return valor;
    }
    public static float flot(){
        Scanner input = new Scanner(System.in);
        float valor=0;
        boolean valorCorrecte=false;
        do {
            valorCorrecte = input.hasNextFloat();

            if (!valorCorrecte) {
                System.out.println("Error! Valor incorrecte");
                input.nextLine();
            } else {
                valor = input.nextFloat();
                input.nextLine();
            }
        } while (!valorCorrecte);
        return valor;
    }
    public static void ruleta(float saldo){
        //int [][] num = new int[38][2];
        int [] num= new int[38];
        String[] color= new String[38];

        for (int i = 0; i < num.length; i++) {
            num[i]=i+1;
            for (int j = 0; j < num.length; j++) {
                color[j]=" Red";
                j++;
                color[j]=" Black";
            }
        }
        for (int i = 0; i <num.length; i++) {
            System.out.print(num[i]);
            System.out.println(color[i]);
            System.out.println("");
        }
        float apuesta2=apuesta(saldo);
        System.out.println("Tu apuesta es de: "+apuesta2);
    }
    public static float apuesta(float saldo){
        float capuesta=0;
        float tapuesta=0;
        System.out.println("Tu saldo es de: "+saldo);
        System.out.println("Introduce la cantidad a apostar: ");
        tapuesta=flot();
        if(tapuesta<=saldo){
            capuesta=tapuesta;
        }else{System.out.println("No tiense suficientes fondos");
            System.out.println("");
            capuesta=apuesta(saldo);}
        return capuesta;
    }
}