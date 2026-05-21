package calculadora_simple.metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("==Bienvenidos a su calculadora virtual==");

        int nav = mostrarMenu(sc);
        int n1 = pedirNumero(sc);
        int n2 = pedirNumero(sc);


        int resultado = 0;

        boolean operacionValida = true;


        switch (nav) {
            case 1:
                resultado = hacerSumar(n1, n2);
                break;
            case 2:
                resultado = hacerResta(n1, n2);
                break;
            case 3:
                resultado = hacerMultiplicacion(n1, n2);
                break;
            case 4:

                if (n2 != 0) {
                    resultado = hacerDivision(n1, n2);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
                break;
        }


        if (operacionValida) {
            mostrarResultado(resultado);
        }
    }

    public static int pedirNumero(Scanner sc) {
        System.out.println("Ingrese el numero:");
        return sc.nextInt();
    }

    public static int mostrarMenu(Scanner sc) {
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");
        int opcion = sc.nextInt();
        if (opcion < 1 || opcion > 4) {
            System.out.println("Error: Opción fuera de rango.");
        }
        return opcion;
    }

    public static int hacerSumar(int a, int b) { return a + b; }
    public static int hacerResta(int a, int b) { return a - b; }
    public static int hacerMultiplicacion(int a, int b) { return a * b; }
    public static int hacerDivision(int a, int b) { return a / b; }



    public static void mostrarResultado(int resultado) {
        System.out.println("El resultado final de la operación es: " + resultado);
    }
}