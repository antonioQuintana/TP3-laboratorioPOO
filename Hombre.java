
/**
 * La clase Hombre cuenta con los atributos: nombre, apellido, edad, estadoCivil y esposa,
 * además de los constructores y Accessors, la clase Hombre cuenta con métodos que permiten
 * asignarle una nueva esposa, divorciarse, y mostrar sus datos en distintos formatos
 * Colabora con la clase Mujer.
 * @see Mujer
 *
 * @author Pannuncio Nicolas - Quintana Antonio
 * @version 01/09/25
 */
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
     * Constructor que no recibe esposa, por lo que el estado civil se inicializa en "Soltero"
     *  y la esposa en null
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }
    /**
     * Constructor que recibe todos los atributos como parametros, 
     * el estado civil se inicializa en "Casado"
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casado");
        this.setEsposa(p_esposa);
    }
    //Setters ----------------------------------------
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;   
    }
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
    }
    //Getters ----------------------------------------
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public Mujer getEsposa(){
        return this.esposa;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    //Otros métodos ----------------------------------------
    /**
     * Verifica que no se encuentre casado y le asigna la esposa que se pasa por parametro,
     * en caso de estar casado, imprime el error.
     * 
     * @param p_esposa nueva esposa
     */
    public void casarseCon(Mujer p_esposa){
        if(this.getEsposa() != null){
            System.out.println("Ya se encuentra casado/a con: " + this.getEsposa()+" No se puede asignar otro espos hasta que se divorcie");
        }else{
            this.setEsposa(p_esposa);
            this.setEstadoCivil("Casado");
        }
    }
    /**
     * Verifica que esté casado, en dicho caso, actualiza el estado a "divorciado" y esposa null
     * En otro caso imprime un mensaje de error.
     */
    public void divorcio(){
        if(this.getEstadoCivil()=="Casado"){
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
        }else{
            System.out.println("No puede divorciarse porque no se encuentra casado");
        }
    }
    /**
     * Retorna una concatenacion de nombre apellido y edad
     * @return nombre apellido y edad.
     */
    public String datos(){
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años";
    }
    /**
     * Emplea el metodo datos() para imprimir los datos y el estado civil
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.datos()+" - "+this.getEstadoCivil());
    }
    /**
     * Verifica que esté casado, en dicho caso imprime con quien, sino imprime que no está casado
     */
    public void casadaCon(){
        if(this.getEstadoCivil()=="Casado"){
            System.out.println(this.datos()+ "está casado con "+ this.getEsposa().datos() );
        }else{
            System.out.println(this.datos()+" no está casado");
        }
    }
}