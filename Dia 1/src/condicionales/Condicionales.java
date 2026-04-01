package condicionales;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        //verificar si es mayor de edad o no
        int edad=20;
        System.out.println("hola cual es su edad? "+edad);
        if (edad >=18){
            System.out.println("Usted es mayor de edad ");
        }else{
            System.out.println(" usted es menor de edad");
        }
        //validar si un estudiante aprobo
        double nota=14.5;
        if(nota>= 11){
            System.out.println("aprobado");
        }
        //verificar si un numero esta dentro de un rngo
        int Edad= 29;
        if(Edad>= 18 && Edad <=30){
            System.out.println("edad dentro del rango permitido");
        }
        //validar si un cliente califica un prestamo

        double ingresos = 3200;
        boolean tieneDeuda = false;
        int aniosTrabajo= 2;
        int age=21;
        boolean califica= true;


        if(ingresos <=2500){
            califica = false;

        }
        if(tieneDeuda == true){
            califica =false;
        }
        if(aniosTrabajo < 2){
            califica =false;
        }
        if(age <21 || age >65){
            califica = false;
        }

        if (califica){
            System.out.println("cliente apto para prestamo");


        }
        if (!califica){
            System.out.println("cliente no apto");
        }

        //validar dado unpuntaje 0 a 100, clasificar en uno de los siguietes rangos:
        /*
         *0 a 20 -> Muy bajo
         * 21 a 50 ->bajo
         * 51 a 80 ->medio
         * 81 a 100-> alto
         * fuerza de rango->puntaje invalido
         * imprimir: Rango: ValoRango
         */


        int puntaje = 75;
        String rango = "No clasificado";


        if (puntaje < 0 || puntaje > 100) {
            rango = "Puntaje invalido";
        }


        if (puntaje >= 0 && puntaje <= 20) {
            rango = "Muy bajo";
        }


        if (puntaje >= 21 && puntaje <= 50) {
            rango = "Bajo";
        }

        if (puntaje >= 51 && puntaje <= 80) {
            rango = "Medio";
        }

        if (puntaje >= 81 && puntaje <= 100) {
            rango = "Alto";
        }


        System.out.println("Rango: " + rango);
        //else

        int num=9;

        if(num>10){
            System.out.println("el numero es mayor a 10");

        }else {
            System.out.println("el numero es menor a 10");
        }

        //else - if
        int note = 13;
        if(note >=18){
            System.out.println("excelente");
        }else if(note >=14){
            System.out.println("bueno");
        }else {
            System.out.println("necesitas mejorar");
        }
        //swich

        int dia=1;

        switch (dia){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            default:
                System.out.println("otro dia");

        }

        //Swich

        Scanner scanner=new Scanner(System.in);
        String producto = scanner.nextLine();
        int stock=8;

        switch (producto){
            case "bebida":
                if(stock >10){
                    System.out.println("stock alto");
                }else if(stock>=5 && stock<=10){
                    System.out.println("stock moderado");
                }else{
                    System.out.println("stock bajo");
                }
                break;
            case "postre":
                if(stock < 3){
                    System.out.println("necesita reposicion");
                }
                break;
            default:
                System.out.println("producto no registrado");

        }


    }
}
