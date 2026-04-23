package calculadora_metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("¿Cuantos numeros desea calcular?");
        int n= sc.nextInt();

        if (n <= 0) {
            System.out.println("Debe ingresar al menos 1 número");
            return;
        }

        int[] numeros=pedirNumeros(sc, n);
        double promedio= calcularPromedio(numeros);
        for (int numer: numeros){
            System.out.println(" los numeros guardados son: "+numer);

        }
        System.out.println("El promedio es:"+promedio);
        System.out.println("El numero mayor es:"+encontrarMayor(numeros));
        System.out.println("El numero menor es: "+encontrarMenor(numeros));
        System.out.println("Los pares son: "+contarPares(numeros));




    }

    public static int[] pedirNumeros(Scanner sc, int n){

        int[]numeros=new int[n];
        for (int i=0; i<numeros.length; i++){
            System.out.println("Numero "+(i+1)+":");
            numeros[i]=sc.nextInt();
        }
        return numeros;
    }

    public static int calcularSuma(int[] numeros){
        int suma=0;
        for (int num: numeros){
            suma+=num;
        }
        return suma;
    }
    public static double calcularPromedio(int[] numeros){
        if(numeros.length==0)return 0;
        double suma= calcularSuma(numeros);
        return suma/numeros.length;
    }
    public static int encontrarMayor(int[] numeros  ){
        int mayor=numeros[0];
        for (int i=0; i<numeros.length;i++){
            if (numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        return mayor;
    }
    public static int encontrarMenor(int[] numeros){
        int menor=numeros[0];
        for (int i=0; i<numeros.length;i++){
            if (numeros[i]<menor){
                menor=numeros[i];
            }
        }
        return menor;
    }
    public static int contarPares(int numeros[]){
        int pares=0;
        for (int par: numeros){
            if (par%2==0){
                pares++;
            }
        }
        return pares;
    }


}
