
/**
 * @author Jorge Pitarch
 *
 */

public class Trabajador{


    
    private String NIF;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cuenta;
    private int Antiguedad;
    private String numSS;
    private String categoria;
    private String grupo;
    private String email;

    public Trabajador(String NIF, String nombre, String apellido1, String apellido2,
     String cuenta, int Antiguedad, String numSS, String categoria, String grupo, String email){

        this.setNIF(NIF);                 this.setNombre(nombre);       this.setApellido1(apellido1);
        this.setApellido2(apellido2);     this.setCuenta(cuenta);       this.setAntiguedad(Antiguedad);
        this.setNumSS(numSS);             this.setCategoria(categoria); this.setGrupo(grupo);
        this.setEmail(email);

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.Antiguedad = antiguedad;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String nIF) {
        this.NIF = nIF;
    }

}