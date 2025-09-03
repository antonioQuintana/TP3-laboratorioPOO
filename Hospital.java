
/**
 * Clase que modela un hospital, cuenta con atributos como nombre del hospital y nombre del director.
 * Ademas de los constructores y los accesors cuenta con métodos que permiten mostrar los datos del hospital.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 01/09/25
 */
public class Hospital
{
    //Variables de instancia
    private String nombreHospital;
    private String nombreDirector;
    
    /**
     * Constructor que recibe todos los atributos como parametro
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector){
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }
    
    //Setters ----------------------------------------
    private void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital;
    }
    
    private void setNombreDirector(String p_nombreDirector){
        this.nombreDirector = p_nombreDirector;
    }
    
    //Getters ----------------------------------------
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    
    /**
     * Muestra en pantalla los datos del hospital junto con los del paciente pasado por parametro
     * @param Paciente cuyos datos se mostraran en pantalla
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("\nHospital: "+ this.getNombreHospital() +"\tDirector: "+ this.getNombreDirector()
                           +"\n--------------------------------------------------------------------------------");
                           p_paciente.mostrarDatosPantalla();//Muestra en pantalla los datos del paciente.
    }
}