import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jorge Pitarch
 */

public class LectorCSV {

    public static final String SEPARADOR = ";" ;
    public static String[][] matriz;
    public static BufferedReader lectura = null;

    public void crearMatriz(String archivo) throws IOException {//sacar el  tamaño de la matriz de los datos del csv

        int filas = 0, columnas = 0;

        lectura = new BufferedReader(new FileReader(archivo));

        String linea = lectura.readLine();

        columnas = linea.split(SEPARADOR).length;

        while (linea != null) {
            filas++;
            linea = lectura.readLine();
        }

        matriz = new String[filas][columnas];
        lectura.close();
    }

    public void leerCSV (String archivo) throws IOException {//almacenar el csv en la matriz

        lectura = new BufferedReader(new FileReader(archivo));

        String linea = lectura.readLine();

        for (int i = 0; i < matriz[0].length; i++){
            for (int j = 0; j < matriz[0][0].length(); j++) {

            }
        }

        /*while (linea != null) {
            matriz[0] = linea.split(SEPARADOR);

        }*/
    }
}
