
/**
 * Clase que calcula el sueldo de un docente.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 24/08/25
 */
public class Docente
{
    //Variables de instancia
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar){
       this.setNombre(p_nombre);
       this.setGrado(p_grado);
       this.setSueldoBasico(p_sueldoBasico);
       this.setAsignacionFamiliar(p_asignacionFamiliar);
    }
    
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    
    private void setAsignacionFamiliar(double p_asignacionFamiliar){
        this.asignacionFamiliar = p_asignacionFamiliar;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getGrado(){
        return this.grado;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }
    
    /**
     * Calcula y devuelve la suma entre el sueldoBasico y asignacionFamiliar
     * @return sueldoBasico + asignacionFamiliar
     */
    public double calcularSueldo(){
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}