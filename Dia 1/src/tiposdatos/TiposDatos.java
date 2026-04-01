package tiposdatos;

public class TiposDatos {
    public static void main(String[] args) {
        // Entiendo que hay muchos tipos de datos primitivos y ocupan una cantidad de espacio en memoria
        //y son estos:
        // byte	8 bits	-128 a 127
        //short	16 bits	-32,768 a 32,767
        //int	32 bits	-2.1e9 a 2.1e9
        //long	64 bits	-9.2e18 a 9.2e18
        //float	32 bits	7 decimales de precisión
        //double 64	bits 15 decimales de precisión
        //char	16 bits	Caracteres Unicode
        //boolean	Variable*	true o false
        //tambien que el String no es primitivo, es un objeto.
        // Cuando creamos un String, estamos creando una referencia a un objeto en memoria.
        //sisi mucho texto:), aunque la AI me da poco miedo pq pienso que inicie tarde jaja otra vez.
        //pero no me permitire ser un perdedor.

        int edad=19;
        String nombre= "Brayan Oscar";
        double talla= 1.74;
        char letra='O' ;
        boolean mayorEdad=true;

        System.out.println("Mi nombre es: "+nombre);
        System.out.println("mi inicial es " +letra);
        System.out.println("Mi edad es : " +edad);
        System.out.println("Mido : " +talla);
        System.out.println("soy mayor de dedad? " + mayorEdad);



    }
}
