package condicionalesIf;



public class clasificacionPuntajes {
    public static void main(String[] args) {

       int puntaje=30;

       String rango="No clasificado";

       if (puntaje <0 || puntaje>100)
           rango="puntaje invalido";

       if (puntaje >=0 && puntaje <=20){
           rango="muy bajo";
       }

       if (puntaje>=21 && puntaje<=50){
           rango="bajo";
       }

       if (puntaje>=51 && puntaje<=80){
           rango="medio";

       }

       if (puntaje>=81 && puntaje<=100){
           rango="alto";
       }
        System.out.println("su rango es: "+ rango);




    }




}
