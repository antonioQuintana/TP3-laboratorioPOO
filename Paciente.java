
/**
 * Clase que contiene los datos basicos de un paciente y permite mostrarlos
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio
 * @version 25/08/25
 */
public class Paciente
{
    //Variables de instancia
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Contructor que recibe todos los atributos como parametros
     */
    public Paciente(int p_historiaClinica, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historiaClinica);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }
    
    //Setters ------------------------------
    private void setHistoriaClinica(int p_historiaClinica){
        this.historiaClinica = p_historiaClinica;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setLocalidadNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    
    private void setLocalidadVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    
    //Getters ------------------------------
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public Localidad getLocalidadNacido(){
        return this.localidadNacido;
    }
    
    public Localidad getLocalidadVive(){
        return this.localidadVive;
    }
    
    /**
     * Muestra en pantalla todos los datos del paciente y la localidad donde vive
     */
    public void mostrarDatosPantalla(){
        System.out.println("\nPaciente: "+ this.getNombre() +"\tHistoria Clinica: "+ this.getHistoriaClinica() +"\tDomicilio: "+ this.getDomicilio()
                           +"\n"+ this.getLocalidadVive().mostrar());
    }
    
    /**
     * Concatena y devuelve una cadena con los datos del paciente y la localidad donde vive
     * @return Cadena con los datos del paciente y la localidad donde vive
     */
    public String cadenaDeDatos(){
        return this.getNombre() +"......"+ this.getHistoriaClinica() +"...."+ this.getDomicilio() +" - "+
               this.getLocalidadVive().getNombre() +" - "+ this.getLocalidadVive().getProvincia();
    }
}