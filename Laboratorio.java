 
/**
 * Clase que modela un objeto de tipo Laborario con los atributos:
 * nombre, domicilio, telefono, compraMinima y diaEntrega.
 * Ademas de los accessors, este objeto cuenta con metodos que 
 * permiten modificar los atributos compraMinima y diaEntrega desde
 * fuera, tambien otro metodo que retorna los datos de contacto del
 * laboratorio
 *
 * @author (Quintana Antonio)
 * @version (1.0 -- 14.08.25)
 */
public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor con todos los atributos pasados por parametro
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    /**
     * Constructos con solo 3 parametros, los faltantes se inicializan en cero (0).
     * @param p_nombre
     * @param p_domicilio
     * @param telefono
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }
    //Setters -------------
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;   
    }
    //Getters ---------------------
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public int getCompraMinima(){
        return this.compraMinima;
    }
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    /**
     * Setter publico de compraMinima
     * @param p_compraMin monto de compra minima
     */
    public void nuevaCompraMinima(int p_compraMin){
        this.setCompraMinima(p_compraMin);
    }
    /**
     * Setter publico de diaEntrega
     * @param p_diaEnt dia de entrega
     */
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }
    /**
     * Retorna los datos de contacto del laboratorio.
     * @return una cadena con los datos del laboratorio.
     */
    public String mostrar(){
        return ("Laboratorio: "+this.getNombre()+"\nDomicilio: "
                +this.getDomicilio()
                +" - Teléfono: "+this.getTelefono());
    }
}