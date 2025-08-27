
/**
 * La clase punto modela un objeto de tipo punto que cuenta con dos atributos 
 * "x" e "y" los cuales representan las cooredenadas de un eje cartesiano.
 * El objeto Punto sera de utilidad para colaborar con otro objetos geometricos 
 * en el futuro.
 * 
 * @author (Antonio Quintana) 
 * @version (1.0 -- 21/08/2025)
 */
public class Punto
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    
    /**
     * Constructor sin parametros, inicializa el punto en el origen.
     */
    public Punto(){
        // initialise instance variables
        x = 0;
        y = 0;
    }
    /**
     * Constructor con parametros, crea el objeto Punto con coordenadas p_x p_y.
     * @param p_x valor que se asigna al atributo x.
     * @param p_y valor que se asigna al atributo y.
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    //Setters ----
    private void setX(double p_x){
        this.x = p_x;
    }
    private void setY(double p_y){
        this.y = p_y;
    }
    //Getters ----
    public double getX(){
        return this.x ;
    }
    public double getY(){
        return this.y ;
    }
    //Otros metodos ----
    /**
     * Modifica las coordenadas x e y del punto,
     * sumando dx y dy correspondientemente a las coordenadas existentes.
     * 
     * @param  dx es el parametro a sumar a x
     * @param  dy es el parametro a sumar a y
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX( this.getX() + p_dx );
        this.setY( this.getY() + p_dy );
    }
    /**
     * Retorna un par ordenado con las coordenadas del punto.
     * @return un par ordenado con las coordenadas del punto.
     */
    public String coordenadas(){
        return "(" + this.getX() + ", " + this.getY() + ")" ;
    }
    /**
     * Muestra una leyenda con los valores de los atributos del objeto punto.
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + " , Y: " + this.getY() );
    }
    /**
     * 
     */
    public double distanciaA(Punto p_ptoDistante){
        double distanciaAux = Math.sqrt(Math.pow(this.getX() - p_ptoDistante.getX() , 2) + Math.pow(this.getY() - p_ptoDistante.getY() , 2) );
        return distanciaAux;
    }
}