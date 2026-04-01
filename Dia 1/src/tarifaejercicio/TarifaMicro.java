package tarifaejercicio;

import java.util.Scanner;

public class TarifaMicro {
    public static void main(String[] args) {
        //calculadora de tarifa de transporte cobra una tarifa segun el tipo de ruta
        //        //corto ->3.00,medio ->5.00,largo ->8.00
        //        //reglas: si el pasajero es estudiante ->20% de descuento
        //        //si es adulto mayor (mayor o igual de 60 años) ->30% descuento
        //        //sino pertenece a ninguo paga normal
        //        //adicional: si el tipo de ruta no existe "mensajede eroro"
        //        //si la edad es menor a 0-> mensaje error
        //        //solo se aplica un descuento, el mayor

        Scanner sc= new Scanner(System.in);
        double tarifaBase=0;

        System.out.println("==== TIPOS DE RUTA ===");
        System.out.println("1. Corto (S/ 3.00)");
        System.out.println("2. Medio (S/ 5.00)");
        System.out.println("3. Largo (S/ 8.00)");
        System.out.println("Seleccione una ruta: ");
        int ruta = sc.nextInt();
        if (ruta <1 || ruta>3 ){
            System.out.println("la Ruta no existe");
            return;
        }


        System.out.println("Ingrese su edad:");
        int edadPasajero = sc.nextInt();

        if(edadPasajero <0 ){
            System.out.println("error de edad ");
            return;
        }

        System.out.println("¿Es estudiante?: (true/false)");
        boolean estuidiante = sc.nextBoolean();





        switch (ruta){
            case 1:
                tarifaBase= 3.00;
                break;
            case 2:
                tarifaBase=5.00;
                break;
            case 3:
                tarifaBase=8.00;

                break;
            default:
                System.out.println("la ruta no existe");


        }
        double Descuento=0;
        if (edadPasajero>=60){
            Descuento= 0.30;
        }else if (estuidiante){
            Descuento=0.20;

        }else {
            Descuento=0;
        }

        double montoDESCUENTO= tarifaBase*Descuento;
        double  precioFinal= tarifaBase-montoDESCUENTO;
        System.out.println("pagar: " +precioFinal);




    }


}

