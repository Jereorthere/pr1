package com.last;

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        System.out.println("Hola benvingut/da al casino");
        float saldo=0;
        menuPrincipal(saldo);

    }

    public static void menuPrincipal(float saldo){
        Scanner input = new Scanner(System.in);
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
                System.out.println(saldo);
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
                submenu();
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
    public static void submenu(){
        System.out.println("a");
    }
    public static void r(){
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
            //System.out.println("");
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
}