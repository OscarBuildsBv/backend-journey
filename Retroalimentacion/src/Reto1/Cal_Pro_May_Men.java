package Reto1;

import java.util.Scanner;

public class Cal_Pro_May_Men {
    public static void main(String[] args) {
        Scanner pou=new Scanner(System.in);
        int[] numeros=new   int[3];

        System.out.println("ingrese los numeros a calcular");
        for (int i=0; i<3; i++){
            System.out.println("Numero "+ (i+1) + ": ");
            numeros[i]=pou.nextInt();
        }
        System.out.println("el primer numero que guardaste fue : "+numeros[0]);
        System.out.println("el segundo numero que guardaste fue : "+numeros[1]);
        System.out.println("el tercero numero que guardaste fue : "+numeros[2]);

        double promedio= numeros[0]+numeros[1]+numeros[2];
        double resultado= promedio/3;
        System.out.println("el promedio es: "+resultado);
        int mayor=numeros[0];
        int menor=numeros[0];

        for (int i=0; i<numeros.length;i++){

            if (numeros[i]>mayor){
                mayor=numeros[i];

            } else if (numeros[i]<menor) {
                menor=numeros[i];

            }

        }
        System.out.println("---------------------------");
        System.out.println("El número MAYOR es: " + mayor);
        System.out.println("El número MENOR es: " + menor);

    }
}
