package Asientos.src.Cine;

import Cine.Peliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Nombre y ruta del archivo
        String nombreArchivo = "Cartelera.txt";

        // Contenido a escribir en el archivo
        String contenido = "¡Hola! Este es el contenido del archivo.";

        ArrayList<Cine.Peliculas> movie = new ArrayList<>();

        // Crear el archivo y escribir en él
        try {
            // Crear un objeto File
            File archivo = new  File(nombreArchivo);

            // Comprobar si el archivo ya existe
            if (!archivo.exists()) {
                archivo.createNewFile(); // Crear el archivo si no existe
            }


            // Crear un FileWriter para escribir en el archivo
            FileWriter fw = new FileWriter(archivo,true);
            Scanner scanner = new Scanner(System.in);
            // Utilizar BufferedWriter para mejor rendimiento
            BufferedWriter bw = new BufferedWriter(fw);


            // Solicitar información de la película

            System.out.println("Ingrese la información de la película:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            bw.write("| Nombre: "+ nombre +" |"); // Escribir el contenido

            System.out.print("Género: ");
            String genero = scanner.nextLine();
            bw.write("| Genero: "+ genero +" |"); // Escribir el contenido

            System.out.print("Descripcion: ");
            String descrip = scanner.nextLine();
            bw.write("| Descripcion: "+ descrip +" |"); // Escribir el contenido

            System.out.print("Duración (en minutos): ");
            int duracion = scanner.nextInt();
            bw.write("| Duracion: "+ duracion +" |"); // Escribir el contenido

            System.out.println(descrip);
            String formato = "2D";
            bw.write("| Formato: "+ formato +" |"); // Escribir el contenido

            String dia="0";
//            movie.add(new Peliculas(nombre,descrip,formato,genero,duracion,01/12/24));

            bw.close(); // Cerrar el BufferedWriter

            System.out.println("Archivo creado y escrito con éxito: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al crear o escribir el archivo: " + e.getMessage());
        }

        // Crear una instancia de Peliculas
//        Cine.Peliculas pelicula = new Cine.Peliculas(nombre,formato,genero,duracion);

        // Crear una instancia de Sala1 asociada a la película
//        Sala sala = new Sala(pelicula);

        // Interacción con el usuario

//        int opcion;
//        do {
//            System.out.println("\nMenú:");
//            System.out.println("1. Mostrar estado de los asientos");
//            System.out.println("2. Registrar un asiento ocupado");
//            System.out.println("3. Salir");
//            System.out.print("Seleccione una opción: ");
//////            opcion = scanner.nextInt();
////
////            switch (opcion) {
////                case 1:
////                    sala.mostrarEstadoAsientos();
////                    break;
////                case 2:
////                    System.out.println("  ");
////                    break;
////                case 3:
////                    System.out.println("¡Gracias por usar el sistema!");
////                    break;
////                default:
////                    System.out.println("Opción no válida. Intente de nuevo.");
////            }
//        } while (opcion != 3);
    }
}


