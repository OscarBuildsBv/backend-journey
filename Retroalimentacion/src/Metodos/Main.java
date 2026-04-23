package Metodos;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números? ");
        int n = sc.nextInt();

        int[] numeros = ingresarNumeros(sc, n);

        double promedio = calcularPromedio(numeros);
        int mayor = obtenerMayor(numeros);
        int menor = obtenerMenor(numeros);

        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

    public static int[] ingresarNumeros(Scanner sc, int n) {
        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        return numeros;
    }

    public static double calcularPromedio(int[] numeros) {
        double suma = 0;

        for (int num : numeros) {
            suma += num;
        }

        return suma / numeros.length;
    }

    public static int obtenerMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }

        return mayor;
    }

    public static int obtenerMenor(int[] numeros) {
        int menor = numeros[0];

        for (int num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }

        return menor;
    }
}