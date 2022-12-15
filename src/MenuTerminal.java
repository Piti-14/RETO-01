import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jorge Pitarch
 */

public class MenuTerminal {

    public static final int CONSULTAR = 1;
    public static final int AÑADIR = 2;
    public static final int MODIFICAR = 3;
    public static final int ELIMINAR = 4;
    public static final int SALIR = 5;
    public static final int VOLVER = 6;

    public static Scanner input = new Scanner(System.in);

    public static String fichero;

    public static void main(String[] args) throws IOException {

        /*menuPrincipal();
        fichero = "./RETO-01/recursos/DatosEmpresa.csv";
        String [][] matriz = new String[0][0];
        LectorCSV lector = new LectorCSV();
        lector.crearMatriz(fichero);
        lector.leerCSV(fichero);

        menuPrincipal();*/
        fichero = "./RETO-01/recursos/DatosEmpresa.csv";
        LectorCSV lector = new LectorCSV();
        lector.crearMatriz(fichero);
        lector.leerCSV(fichero);

        //Consultas consultaPiti = new Consultas();
        //consultaPiti.trabajadoresPorDepartamento("3");

        //

    }

    private static int menuPrincipal() {
        int opcion;
        System.out.println("1.- CONSULTAR DATOS \n2.- INCORPORAR DATOS \n3.- MODIFICAR DATOS \n4.- ELIMINAR DATOS \n5.- SALIR");

        System.out.println("¿Qué deseas hacer?");
        opcion = input.nextInt();
        input.nextLine();

        return subMenu(opcion);
    }

    private static int subMenu(int n) { //Rehacer if con un switch y añadir opción de salir y volver atrás

        int opcion;

        switch (n){
            case CONSULTAR -> System.out.println("1.- Consultar datos personales de un trabajador (DNI)" +
                                                 "\n2.- Consultar datos empresariales de los trabajadores (ID)" +
                                                 "\n3.- Consultar trabajadores de un departamento" +
                                                 "\n4.- Consultar trabajadores de una categoría "   +
                                                 "\n5.- Consultar horas extra de una categoría " +
                                                 "\n6.- Consultar horas extra de un trabajador (ID)" +
                                                 "\n7.- Consultar horas extra de un trabajador (DNI)" +
                                                 "\n8.- Consultar horas extra de un departamento");

            case AÑADIR -> System.out.println("1.- Añadir datos personales de un trabajador" +
                                              "\n2.- Añadir datos empresariales de un trabajador" +
                                              "\n3.- Añadir nuevo departamento");

            case MODIFICAR -> System.out.println("1.- Modificar datos personales de un trabajador" +
                                                 "\n2.- Modificar datos empresariales de un trabajador");

            case ELIMINAR -> System.out.println("1.- Eliminar un departamento" + //Eliminar en cascada
                                                "\n2.- Eliminar un departamento (modo seguro)"); //Si la integridad referencial lo permite

            case SALIR -> { return 0; }

            default -> System.out.println("Err!! Opción inválida, por favor otra opción.");
        }

        System.out.println("Volver atrás (0) \nSalir (-1)");
        System.out.print("Introduce una opción: ");
        opcion = input.nextInt();
        input.nextLine();

        return opcion;
    }
}
