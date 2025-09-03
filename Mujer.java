
/**
 * La clase Mujer cuenta con los atributos: nombre, apellido, edad, estadoCivil y esposo,
 * además de los constructores y Accessors, la clase mujer cuenta con métodos que permiten
 * asignarle un nuevo esposo, divorciarse, y mostrar sus datos en distintos formatos
 * Colabora con la clase Hombre.
 * @see Hombre
 *
 * @author Pannunzio Nicolas - Quintana Antonio
 * @version 01/09/25
 */
public class Mujer
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructor para objetos de la clase Mujer sin esposo
     * Inicializa el estado civil como "Soltera" y el esposo null
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    /**
     * Constructor para objetos de la clase Mujer con esposo
     * Inicializa el estado civil como "Casada"
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada");
        this.setEsposo(p_esposo);
    }

    //Setters --------------------------------
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;   
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    //Getters --------------------------------
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public Hombre getEsposo(){
        return this.esposo;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    //Otros metodos ---------------------------
    /**
     * Verifica que no se encuentre casada y le asigna el esposo que se pasa por parametro,
     * en caso de estar casada, imprime el error.
     * 
     * @param p_esposo nuevo esposo
     */
    public void casarseCon(Hombre p_esposo){
        if(this.getEsposo() != null){
            System.out.println("Ya se encuentra casado/a con: " + this.getEsposo()+" No se puede asignar otro esposo hasta que se divorcie");
        }else{
            this.setEsposo(p_esposo);
            this.setEstadoCivil("Casada");
        }
    }
    /**
     * Verifica que esté casada, en dicho caso, actualiza el estado a "divorciada" y esposo null
     * En otro caso imprime un mensaje de error.
     */
    public void divorcio(){
        if(this.getEstadoCivil()=="Casada"){
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
        }else{
            System.out.println("No puede divorciarse porque no se encuentra casada");
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
     * Verifica que esté casada, en dicho caso imprime con quien, sino imprime que no está casada
     */
    public void casadaCon(){
        if(this.getEstadoCivil()=="Casada"){
            System.out.println(this.datos()+ "está casada con "+ this.getEsposo().datos() );
        }else{
            System.out.println(this.datos()+" no está casada");
        }
    }
    
    
    
    
    
}