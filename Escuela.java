
/**
 * La clase escuela contiene nombre, domicilio y director. Ademas permite imprimir 
 * un recibo de sueldo para un Docente.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 24/08/25
 */
public class Escuela
{
    //Variables de instancia
    private String nombre;
    private String domicilio;
    private String director;
    
    /**
     * Constructor que recibe todos los atributos como parametros
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    //Setters ----------------------------------------
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    //Getters ----------------------------------------
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    /**
     * Imprime en pantalla un recibo con los datos de la escuela y del docente
     * @param Objeto tipo docente, cuyos datos se mostraran en pantalla
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("\nEscuela: "+ this.getNombre() +"\tDomicilio: "+ this.getDomicilio() +"\tDirector: "+ this.getDirector() 
                           +"\n--------------------------------------------------------------------------\n"
                           +"Docente:\t"+ p_docente.getNombre() +"\nSueldo: ......................\t$"+ p_docente.calcularSueldo()
                           +"\nSueldo Basico: ...............\t$"+ p_docente.getSueldoBasico()
                           +"\nAsignacion Familiar: .........\t$"+ p_docente.getAsignacionFamiliar());
    }
}