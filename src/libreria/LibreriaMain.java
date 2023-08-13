package libreria;

import java.util.Scanner;

import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class LibreriaMain {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AutorServicio a = new AutorServicio();
        EditorialServicio e = new EditorialServicio();
        LibroServicio l = new LibroServicio();
        boolean menu = true;

        do {
            System.out.println("\n");
            System.out.println("                       MENÚ                                  ");
            System.out.println("========================================================");
            System.out.println("1. Agregar autor, editorial, o libro.");
            System.out.println("2. Dar de alta/baja o editar autor, editorial, o libro.");
            System.out.println("3. Buscar Autor por nombre");
            System.out.println("4. Buscar libro por ISBN");
            System.out.println("5. Buscar libro por Título");
            System.out.println("6. Buscar libro/s por nombre de Autor");
            System.out.println("7. Buscar libro/s por nombre de Editorial");
            System.out.println("8. Prestar libro");
            System.out.println("9. Salir");
            System.out.println("========================================================");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            a.guardarAutor();
                            break;
                        case 2:
                            e.guardarEditorial();
                            break;
                        case 3:
                            l.guardarLibro();
                            break;
                        default:
                            System.out.println("Opción no reconocida.");
                    }
                    break;
                case 2:
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    opcion = leer.nextInt();

                    switch (opcion) {
                        case 1:
                            a.darBajaAutor();
                            break;
                        case 2:
                            e.darBajaEditorial();
                            break;
                        case 3:
                            l.darBajaLibro();
                            break;
                        default:
                            System.out.println("Opción no reconocida.");
                    }
                    break;
                case 3:
                    a.buscarAutorNombre();
                    break;
                case 4:
                    l.buscarLibroIsbn();
                    break;
                case 5:
                    l.buscarLibroTitulo();
                    break;
                case 6:
                    l.buscarLibroAutor();
                    break;
                case 7:
                    l.buscarLibroEditorial();
                    break;
                case 8:
                    l.prestarLibro();
                    break;
                case 9:
                    menu = false;
                    System.out.println("Gracias por usar mi programa!");
                    break;
                default:
                    System.out.println("Opción no reconocida. Por favor, elige una opción del menú.");
            }
        } while (menu);
        System.out.println("\n");

    }
}
