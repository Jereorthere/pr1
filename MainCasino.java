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
                System.out.println("ERROR: Opción no válida !");
                menuPrincipal(saldo);
                break;
        }
    }
    public static int entero(){ //Control de errores de enteros
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
    public static float flot(){ //Control de errores de floats
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
    
    public static float apuesta(float saldo){ //Comprueba si la apuesta indicada es valida comparandolo con el saldo y usando recursividad
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
