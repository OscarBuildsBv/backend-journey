package Reto1;

import java.util.Scanner;

public class Cal_Pro_May_Men {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("¿Cuantos numeros desea calcular?");
        int n=sc.nextInt();
        if (n<=0){
            System.out.println("No puede elejir numeros negativos");
            return;
        }

        int[] numeros= new int[n];
        System.out.println("Ingrese los numeros: ");
        for (int i=0; i<numeros.length;i++){
            System.out.println("Numero "+(i + 1)+":");
            numeros[i]=sc.nextInt();
        }
        double suma=0;
        for (int num: numeros){
            suma+=num;
        }
        double promedio=suma/numeros.length;
        System.out.println("El promedio es: "+promedio);

        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]>mayor){
                mayor=numeros[i];
            }
            if (numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);

    }
}
