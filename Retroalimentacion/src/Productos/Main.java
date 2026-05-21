package Productos;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el monto de su salario");
        double salarioIngresado=sc.nextDouble();
        if (validarSalario(salarioIngresado)){
            double salarioFinal=recibirSalario(salarioIngresado);
            System.out.println("salario aceptado correctamente: $ "+salarioFinal);
        }

    }

    public static boolean validarSalario(double salarioAValidar){
        if (salarioAValidar>0)
            return true;
        else return false;
    }
    public static double recibirSalario(double salario){
        return salario;
    }

}
