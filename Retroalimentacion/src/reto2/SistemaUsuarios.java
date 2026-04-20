package reto2;

import java.util.ArrayList;
import java.util.List;

public class SistemaUsuarios {
    public static void main(String[] args) {

        List<Usuario> usuarios=new ArrayList<>();

        usuarios.add(new Usuario(1, "ana"));
        usuarios.add(new Usuario(2,"Pedro"));
        usuarios.add(new Usuario(1,"Lucia"));

        System.out.printf("----LISTA INICIAL----");
        usuarios.forEach(System.out::println);

        String nombreBuscar="Pedro";
        System.out.println("\n--- Buscando a: " + nombreBuscar + " ---");
        for (Usuario u : usuarios) {
            if (u.nombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Usuario encontrado: " + u);
            }
        }

        // 3. Eliminar usuario (por nombre)
        String nombreAEliminar = "Ana";
        // Usamos removeIf, que es una forma elegante de filtrar y borrar
        usuarios.removeIf(u -> u.nombre().equalsIgnoreCase(nombreAEliminar));

        System.out.println("\n--- Lista tras eliminar a " + nombreAEliminar + " ---");
        usuarios.forEach(System.out::println);

    }
}
