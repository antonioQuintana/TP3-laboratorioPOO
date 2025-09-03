
/**
 * La clase Rectangulo permite calcular la superficie, perimetro de un objeto tipo Rectangulo
 * Ademas de calcular su distancia con otroRectangulo, quien es mayor,
 * mostrar sus caracteristicas en pantalla y desplazar el origen del rectangulo sin modificar 
 * sus medidas
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 23/08/25
 */
public class Rectangulo
{
    //Variables de instancia
    private Punto origen;
    private double ancho;
    private double alto;
    
    /**
     * Constructor que recibe todos los atributos como parametros
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /**
     * Constructor que recibe solo ancho y alto como parametros. Inicializa el oriigen en (0,0)
     */
    public Rectangulo(double p_ancho, double p_alto){
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        Punto p_origen = new Punto(0, 0);//Instancio p_origen para poder inicializar el origen en (0,0)
        this.setOrigen(p_origen);
    }
    
    //Setters ------------------------------
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    //Getters ------------------------------
    public Punto getOrigen(){
        return this.origen;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public double getAlto(){
        return this.alto;
    }
    
    /**
     * Modifica el valor del origen sin cambiar las dimensiones (Mueve el rectangulo)
     * @param Un valor que reemplaza a x y otro valor que reemplaza a y
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    /**
     * Muestra en pantalla los valores: Origen, Alto, Ancho, Superficie y Perimetro.
     */
    public void caracteristicas(){
        System.out.println("\n****** Rectangulo ******\nOrigen: ("+ this.getOrigen().getX() +", "+ this.getOrigen().getY() +")"+
                           "\t- Alto: "+ this.getAlto() +"\t- Ancho: "+ this.getAncho() +"\nSuperficie: "+ this.superficie() +"\t-Perimetro: "+ this.perimetro());
    }
    
    /**
     * Calcula el perimetro del Rectangulo que es = 2 * (alto + ancho)
     * @return el perimetro del rectangulo
     */
    public double perimetro(){
        return 2 * (this.getAlto() + this.getAncho());
    }
    
    /**
     * Calcula la superficie del rectangulo que es = alto * ancho
     * @return la superficie del rectangulo
     */
    public double superficie(){
        return this.getAlto() * this.getAncho();
    }
    
    /**
     * Calcula y devuelve la distancia entre "this" y otroRectangulo
     * @param un objeto de tipo Rectangulo para calcular su distancia con "this"
     * @return Devuelve la distancia entre "this" y otroRectangulo.
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    
    /**
     * Compara y devuelve el mayor entre "this" y otroRectangulo
     * @param un objeto de tipo Rectangulo para calcular si es mayor a "this"
     * @return Devuelve el mayor entre "this" y otroRectangulo.
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
    }
   
}