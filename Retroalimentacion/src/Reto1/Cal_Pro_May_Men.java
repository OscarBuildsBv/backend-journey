package Reto1;

import java.util.Scanner;

public class Cal_Pro_May_Men {
    public static void main(String[] args) {
        Scanner pou=new Scanner(System.in);
        int[] numeros=new   int[5];

        System.out.println("ingrese los numeros a calcular");
        for (int i=0; i<5; i++){
            System.out.println("Numero "+ (i+1) + ": ");
            numeros[i]=pou.nextInt();
        }


        double suma=0;
        for (int num: numeros){
            suma+=num;
        }
        double promedio= suma/numeros.length;
        System.out.println("El promedio es: "+promedio);
        int mayor=numeros[0];
        int menor=numeros[0];

        for (int i=0; i<num eros.length;i++){

            if (numeros[i]>mayor){
                mayor=numeros[i];

            }
            if (numeros[i]<menor) {
                menor=numeros[i];

            }

        }
        System.out.println("---------------------------");
        System.out.println("El número MAYOR es: " + mayor);
        System.out.println("El número MENOR es: " + menor);

    }
}
