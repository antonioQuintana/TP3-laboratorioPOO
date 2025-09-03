/**
 * La clase Circulo permite calcular la superficie, perimetro de un objeto tipo Circulo.
 * Ademas de calcular su distancia con otroCirculo, quien es mayor,
 * mostrar sus caracteristicas en pantalla y desplazar el centro del circulo
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 23/08/25
 */
public class Circulo
{
    //Variables de instancia
    private double radio;
    private Punto centro;
    
    /**
     * Constructor que recibe ambos atributos como parametros
     */
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /**
     * Constructor que inicializa un circulo con radio cero y punto(0,0)
     */
    public Circulo(){
        this.setRadio(0);
        Punto p_centro = new Punto(0, 0);//Instancio p_centro para poder inicializar el centro en (0,0)
        this.setCentro(p_centro);
    }
    
    //Setters
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    //Getters
    public Punto getCentro(){
        return this.centro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    /**
     * Modifica el valor del centro sin cambiar el radio (Mueve el circulo)
     * @param Un valor que reemplaza a x y otro valor que reemplaza a y
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     * Muestra en pantalla los valores: Centro, radio, Superficie y perimetro.
     */
    public void caracteristicas(){
        System.out.println("\n****** Circulo ******\nCentro: ("+ this.getCentro().getX() +", "+ this.getCentro().getY() +")"+
                           "\t- Radio: "+ this.getRadio() +"\nSuperficie: "+ this.superficie() +"\t-Perimetro: "+ this.perimetro());
    }
    
    /**
     * Calcula el perimetro del circulo que es = 2*PI*radio
     * @return el perimetro del circulo
     */
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    /**
     * Calcula la superficie del circulo que es = PI*(radio)^2
     * @return la superficie del circulo
     */
    public double superficie(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    /**
     * Calcula y devuelve la distancia entre "this" y otroCirculo
     * @param un objeto de tipo Circulo para calcular su distancia con "this"
     * @return Devuelve la distancia entre "this" y otroCirculo.
     */
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    /**
     * Compara y devuelve el mayor entre "this" y otroCirculo
     * @param un objeto de tipo Circulo para calcular si es mayor a "this"
     * @return Devuelve el mayor entre "this" y otroCirculo.
     */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
}