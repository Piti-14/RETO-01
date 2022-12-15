import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Jorge Pitarch
 */

public class LectorCSV {

    public static final String SEPARADOR = ";" ;

    public static BufferedReader lectura = null;
    public static String[][] matriz;

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

    public String[][] leerCSV (String archivo) throws IOException {//almacenar el csv en la matriz

        lectura = new BufferedReader(new FileReader(archivo));

        String linea = lectura.readLine();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Arrays.toString(linea.split(SEPARADOR));
                System.out.println(matriz[i][j]);

                linea = lectura.readLine();
            }

            if (linea == null){
                break;
            }
        }
        lectura.close();

        return matriz;
    }

    //public void consultarDato (String)
    /*public void limpiarMatriz(){

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = null;
            }
        }
    }*/
}
