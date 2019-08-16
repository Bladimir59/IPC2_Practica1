package practica1;

/**
 *
 * @author Bladimir
 */
public class Personal {
    private String nombre;
    private int telefono;
    private int CUI;
    private int NIT;

    public Personal(String nombre, int telefono, int CUI, int NIT) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.CUI = CUI;
        this.NIT = NIT;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCUI() {
        return CUI;
    }

    public void setCUI(int CUI) {
        this.CUI = CUI;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }
    
    
}
