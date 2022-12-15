/**
 * @author Jorge Pitarch
 */

public class Consultas {

    public static final String RUTA = "./RETO-01/recursos/";
    private static String[][] m;

    public void datosPersonales (String dni){

    }

    public void datosPersonales (String DNI, String cuenta){//Se puede hacer sin autonumérico, pidiendo cuenta y NIF

    }

    public void trabajadoresPorDepartamento (String dept) throws IOException {

        LectorCSV lector = new LectorCSV();
        lector.crearMatriz(RUTA + "Empleados.csv");
        m = lector.leerCSV(RUTA + "Empleados.csv");

        for (int i = 1; i < m.length; i++) {
            if (m[i][(m[i].length - 1)].compareTo(dept) == 0){
                System.out.println(m[i][m[i].length - 1]);
                //System.out.println(matriz[i]);
            }
        }



        /*for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {

            }
        }*/

    }

    public void trabajadoresPorCategoria (String cat){

    }

    public void horasExtraCategoria (String cat){

    }

    public void horasExtra (int ID){

    }

    public void horasExtra (String dni){

    }

    public void horasExtraDepartamento (String dept){

    }
}
