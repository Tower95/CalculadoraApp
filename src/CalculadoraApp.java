import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        Boolean ciclo = true;

        while (ciclo){
            try {
                System.out.println("**** Aplicacion Calculadora ****");
                printMenu();
                int option = Integer.parseInt(consola.nextLine());

                if (option == 5) {
                    ciclo = false;
                    System.out.println("Gracias por usar la calculadora \nAdios...");
                    break;
                }

                switch (option) {
                    case 1:
                        suma();
                        break;
                    case 2:
                        resta();
                        break;
                    case 3:
                        multi();
                        break;
                    case 4:
                        division();
                        break;
                    default:
                        System.out.println("Opcion erronea");
                        ciclo = false;
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Ocurrio un error " +e.getMessage());
            }
            waitEnter();
        }

    }

    public static void printMenu(){
        System.out.println("Ingrese una de las siguientes opciopnes:");
        //MENU
        System.out.println("1.- SUMA");
        System.out.println("2.- RESTA");
        System.out.println("3.- MULTIPLICACION");
        System.out.println("4.- DIVISION");
        System.out.println("5.- SALIR");
        System.out.print("Cual opcion quiere: ");
    }

    public static void suma (){
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona valor operando1: ");

        var operando1 = Integer.parseInt( consola.nextLine());

        System.out.print("Proporciona valor operando2: ");
        var operando2 = Integer.parseInt( consola.nextLine());

        var resultado = operando1 + operando2;

        System.out.println("resultado: "+resultado);
    }
    public static void resta (){
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona valor operando1: ");

        var operando1 = Integer.parseInt( consola.nextLine());

        System.out.print("Proporciona valor operando2: ");
        var operando2 = Integer.parseInt( consola.nextLine());

        var resultado = operando1 - operando2;

        System.out.println("resultado: "+resultado);
    }

    public static void multi (){
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona valor operando1: ");

        var operando1 = Integer.parseInt( consola.nextLine());

        System.out.print("Proporciona valor operando2: ");
        var operando2 = Integer.parseInt( consola.nextLine());

        var resultado = operando1 * operando2;

        System.out.println("resultado: "+resultado);
    }

    public static void division (){
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona valor operando1: ");

        var operando1 = Integer.parseInt( consola.nextLine());

        System.out.print("Proporciona valor operando2: ");
        var operando2 = Integer.parseInt( consola.nextLine());

        var resultado = operando1 / operando2;

        System.out.println("resultado: "+resultado);
    }

    public static void waitEnter (){

        Scanner consola = new Scanner(System.in);
        System.out.println("Presiona Enter para continuar...");
        consola.nextLine();

    }
}
