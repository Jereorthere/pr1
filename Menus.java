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
