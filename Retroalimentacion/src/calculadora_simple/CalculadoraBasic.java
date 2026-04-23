package calculadora_simple;

import java.util.Scanner;

public class CalculadoraBasic {
    public static void main(String[] args) {

        double resultado;
        int n1,n2, nav;
        Scanner oscar=new Scanner(System.in);

        System.out.println("====Bienvenidos a su calculadora Basica======");
        System.out.println("Elija la operacion que desea hacer: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.division");
        nav=oscar.nextInt();
        if (nav>=1 && nav<=4){

        }else {
            System.out.printf("Numero no disponible");
            return;
        }

        switch (nav){
            case 1:
                System.out.println("Ingrese el primer numero: ");
                n1=oscar.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                n2=oscar.nextInt();
                resultado=n1+n2;
                System.out.println("el resultado es: "+resultado);
                break;
            case 2:
                System.out.println("Ingrese el primer numero: ");
                n1=oscar.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                n2=oscar.nextInt();
                resultado=n1-n2;
                System.out.println("el resultado es: "+resultado);
                break;
            case 3:
                System.out.println("Ingrese el primer numero: ");
                n1=oscar.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                n2=oscar.nextInt();
                resultado=n1*n2;
                System.out.println("el resultado es: "+resultado);
                break;
            case 4:
                System.out.println("Ingrese el primer numero: ");
                n1=oscar.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                n2=oscar.nextInt();
                if (n2==0){
                    System.out.println("No se puede divir entre cero");
                    return;
                }
                resultado=n1/n2;
                System.out.println("el resultado es: "+resultado);
                break;

        }

    }
}
