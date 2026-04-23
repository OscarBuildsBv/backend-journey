package calculadora_simple.metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("==Bienvenidos a su calculadora virtual==");
        int nav=mostrarMenu(sc);

        switch (nav){
            case 1: System.out.println("Ingrese el primer numero: ");
                int a=sc.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                int b= sc.nextInt();
                int resultado= hacerSumar(a,b);
                System.out.println("La suma es: "+resultado);
                break;
            case 2:
                System.out.println("Ingrese el primer numero: ");
                 a=sc.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                b= sc.nextInt();
                resultado= hacerResta(a,b);
                System.out.println("La resta es: "+resultado);
                break;
            case 3:
                System.out.println("Ingrese el primer numero: ");
                a=sc.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                b= sc.nextInt();
                resultado= hacerMultiplicacion(a,b);
                System.out.println("La multiplicacion es: "+resultado);
                break;
            case 4:
                System.out.println("Ingrese el primer numero: ");
                a=sc.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                b= sc.nextInt();
                resultado= hacerDivision(a,b);
                System.out.println("La divison es: "+resultado);
                break;
        }

    }
    public static int mostrarMenu(Scanner sc){

        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");
        int opcion=sc.nextInt();
        if (opcion>=1 && opcion<=4){

        }else {
            System.out.println("error");
        }
        return opcion;
    }
    public static int hacerSumar(int a, int b){return a+b;}
    public static int hacerResta(int a, int b){return a-b;}
    public static int hacerMultiplicacion(int a, int b){return a*b;}
    public static int hacerDivision(int a, int b){return a/b;}

}
