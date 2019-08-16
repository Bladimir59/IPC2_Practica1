package practica1;

/**
 *
 * @author Bladimir
 */
public class Factura extends Cliente{
    private String codigo_factura;
    private int total;
    private String detalle;
    

    public Factura(String nombre, int telefono, int CUI, int NIT) {
        super(nombre, telefono, CUI, NIT);
    }
    
    
}
