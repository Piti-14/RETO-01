/**
 * @author Jorge Pitarch
 *
 */
public class Departamento {



    private int numero;
    private String nombre;

    public Departamento(int numero, String nombre){

        this.numero = numero;
        this.nombre = nombre;
    }

    public void setNumero(int n){
        numero = n;
    }

    public int getNumero(){
        return numero;
    }

    public void setNombre(String s){
        nombre = s;
    }

    public String getNombre(){
        return nombre;
    }
    
}
