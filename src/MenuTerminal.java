import java.util.Scanner;

/**
 * @author Jorge Pitarch
 */

public class MenuTerminal {

    public static final int CONSULTAR = 1;
    public static final int AÑADIR = 2;
    public static final int MODIFICAR = 3;
    public static final int ELIMINAR = 4;

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        menuPrincipal();
    }

    private static int menuPrincipal() {
        int opcion;
        System.out.println("1.- CONSULTAR DATOS \n2.- INCORPORAR DATOS \n3.- MODIFICAR DATOS \n4.- ELIMINAR DATOS");

        System.out.println("¿Qué deseas hacer?");
        opcion = input.nextInt();
        input.nextLine();

        return subMenu(opcion);
    }

    private static int subMenu(int n) {

        int opcion;
        if (n == CONSULTAR){

            System.out.println("1.- Consultar datos personales de un trabajador (DNI)" +
                               "\n2.- Consultar datos empresariales de los trabajadores (ID)" +
                               "\n3.- Consultar trabajadores de un departamento" +
                               "\n4.- Consultar trabajadores de una categoría "   +
                               "\n5.- Consultar horas extra de una categoría " +
                               "\n6.- Consultar horas extra de un trabajador (ID)" +
                               "\n7.- Consultar horas extra de un trabajador (DNI)" +
                               "\n8.- Consultar horas extra de un departamento");

        } else if (n == AÑADIR){

            System.out.println("1.- Añadir datos personales de un trabajador" +
                               "\n2.- Añadir datos empresariales de un trabajador" +
                               "\n3.- Añadir nuevo departamento");

        } else if (n == MODIFICAR){

            System.out.println("1.- Modificar datos personales de un trabajador" +
                               "\n2.- Modificar datos empresariales de un trabajador");

        } else {

            System.out.println("1.- Eliminar un departamento" + //Eliminar en cascada
                               "\n2.- Eliminar un departamento (modo seguro)"); //Si la integridad referencial lo permite
        }

        System.out.print("Introduce una opción: ");
        opcion = input.nextInt();
        input.nextLine();

        return opcion;
    }
}
