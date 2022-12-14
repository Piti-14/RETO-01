
/**
 * @author Jorge Pitarch
 *
 */
public class GrupoCotizacion {
    


    private String nombre;
    private String numero;
    private String formacion;
    private double salarioBase;

    public GrupoCotizacion(String nombre, String numero, String formacion, double salarioBase){

        this.setNombre(nombre);
        this.setNumero(numero);
        this.setFormacion(formacion);
        this.setSalarioBase(salarioBase);

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
