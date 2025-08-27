
/**
 * La clase producto modela un objeto de nombre Producto con varios atributos propios y colabora con otro objeto
 * ya definido que es Laboratorio, ademas de los Accessors esta clase posee metodos que permiten calcular y mostrar
 * los precios de lista y de contado del producto, asi como imprimir leyendas con los datos del laboratorio y demas.
 * 
 * @author (Antonio Quintana) 
 * @version (1.0 -- 25/08/25)
 */
public class Producto
{
    // instance variables - replace the example below with your own
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    /**
     * Constructor for objects of class Producto
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, 
                    int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLab(p_lab);
        //incializamos variables que no se pasan por arg
        this.setStock(0);
    }
    /**
     * Segundo constructor de Producto
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setLab(p_lab);
        //incializamos variables que no se pasan por arg
        this.setStock(0);
        this.setPorcPtoRepo(0);
        this.setExistMinima(0);
    }
    //Setters ----
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    private void setDesc(String p_desc){
        this.descripcion = p_desc;
    }
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    private void setLab(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    //Getters ----
    public int getCodigo(){
        return this.codigo ;
    }
    public String getRubro(){
        return this.rubro ;
    }
    public String getDescripcion(){
        return this.descripcion ;
    }
    public double getCosto(){
        return this.costo ;
    }
    public int getStock(){
        return this.stock ;
    }
    public double getPorcPtoRepo(){
        return this.porcPtoRepo ;
    }
    public int getExistMinima(){
        return this.existMinima ;
    }
    public Laboratorio getLaboratorio(){
        return this.laboratorio ;
    }
    /**
     * Ajuste permite aumentar o disminuir el stock del producto
     * @param p_cantidad modifica el stock en esa cantidad
     */
    public void ajuste(int p_cantidad){
        this.setStock(this.stock + p_cantidad);
    }
    /**
     * stockValorizado devuelve el resultado de multiplicar el stock por el precio de costo mas una rentabilidad
     * del doce porciento
     * @return stock * precio de costo + 12%
     */
    public double stockValorizado(){
        return this.getStock()*this.getCosto()*1.12;
        //multiplicar por 1 es el 100% y por 1.12 -> 112% es decir, el valor mas el 12%;
    }
    /**
     * devuelve el precio de lista sumando 12% al precio de costo
     * @return precio de lista sumando 12% al costo
     */
    public double precioLista(){
        return this.getCosto()*1.12;
    }
    /**
     * devuelve el precio de contado restando 5% al precio de lista
     * @return precio de contado restando 5% al precio de lista
     */
    public double precioContado(){
        return this.precioLista()*0.95;
    }    
    /**
     * Mostrar imprime una leyenda con los datos del laboratorio y del producto
     */
    public void mostrar(){
        System.out.println("Laboratorio: " + this.getLaboratorio().getNombre());
        System.out.println("Domicilio: " + this.getLaboratorio().getDomicilio() + " - Telefono: "
                            + this.getLaboratorio().getTelefono() + "\n");
        
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock()  + " - Stock Valorizado: $" + String.format("%.2f",this.stockValorizado()));
    }
    /**
     * Mostra LINEA retorna la descripcion y los precios de lista y contado.
     * @return retorna descripcion, precio de lista y de contado
     */
    public String mostrarLinea(){
        return this.getDescripcion()+" "+String.format("$%.2f", this.precioLista())+" "+String.format("$%.2f", this.precioContado());
    }
    //Setters publicos ----
    /**
     * Permite volver a setear el valor del porcPtoRepo
     */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    /**
     * Permite volver a setear el valor del existMinima
     */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
}