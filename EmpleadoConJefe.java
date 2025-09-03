import java.util.*;
import java.util.GregorianCalendar;
/**
 * La clase EmpleadoConJefe cuenta con los atributos cuil, apellido, nombre, sueldoBasico, fechaIngreso (Calendar), 
 * jefe (EmpleadoConJefe) y anioIngreso (int), ademas de los contructores y los accessors cuenta con métodos para 
 * calcular la antiguedad, el sueldo neto, mostrar los datos por pantalla, mostrar los datos en una linea y saber si 
 * es el aniversario del empleado.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 01/09/25
 */
public class EmpleadoConJefe{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
    /**
     * Constructor con jefe y fecha de ingreso
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
    /**
     * Constructor sin jefe y fecha de ingreso
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }
    /**
     * Constructor sin jefe y con año de ingreso
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }

    //Setters ----------------------------------------
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setImporte(double p_importe){
        this.sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anio){
        Calendar fechaAux = Calendar.getInstance();
        fechaAux.set(Calendar.MONTH, 0);
        fechaAux.set(Calendar.DAY_OF_MONTH, 1);
        fechaAux.set(Calendar.YEAR, p_anio); //Setea en el primer dia del año ingresado
        this.setFechaIngreso(fechaAux);
    }
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    //Getters ----------------------------------------
    public long getCuil(){
        return this.cuil;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getImporte(){
        return this.sueldoBasico;
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    public int getAnio(){
        return this.getFechaIngreso().get(Calendar.YEAR);
    }
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    
    /**
     * Calcula los años de antiguedad en la empresa
     * @return años de antiguedad
     */

    public int antiguedad(){
        Calendar fechaActual = Calendar.getInstance();
        int anioActual = fechaActual.get(Calendar.YEAR);
        if(this.getFechaIngreso()!=null){
           return anioActual - this.getFechaIngreso().get(Calendar.YEAR);
        }else{
            return anioActual - this.getAnio();
        }
    }

    /**
     * Calcula el descuento segun el sueldo basico
     * @return descuento
     */
    private double descuento(){
        return this.getImporte()*0.02+1500;
    }
    /**
     * Calcula el adicional segun la antiguedad
     * @return adicional
     */
    private double adicional(){
        if(this.antiguedad() < 2){
            return this.getImporte()*0.02;
            
        }else if( this.antiguedad() >= 10 ){
            return this.getImporte()*0.06;
        }else{
            return this.getImporte()*0.04;
        }
    }
    /**
     * Calcula el sueldo neto sumando el adicional al sueldo basico y restando el descuento.
     * @return retorna el sueldo neto.
     */
    public double sueldoNeto(){
        return this.getImporte()+this.adicional()-this.descuento();
    }
    /**
     * Concatena nombre y apellido del empleado.
     * @return retorna el nombre y apellido del empleado.
     */
    public String nomYape(){
        return this.getNombre()+", "+this.getApellido();
    }
    /**
     * Concatena apellido y nombre del empleado.
     * @return retorna apellido y nombre del empleado.
     */
    public String apeYnom(){
        return (this.getApellido()+", "+this.getNombre());
    }
    /**
     * Muestra por pantalla los datos del empleado y a quien responde.
     * Considera que si no tiene jefe es el gerente general.
     */
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: "+this.nomYape());
        System.out.print("CUIL: "+this.getCuil());
        System.out.println("  Antiguedad: "+this.antiguedad()+" años de servicio");
        System.out.println("Sueldo Neto: $"+this.sueldoNeto());
        if(this.getJefe()!=null){
            System.out.println("Responde a: "+this.getJefe().nomYape());
        }else{
            System.out.println("Responde a: GERENTE GENERAL");
        }
    }

    /**
     * Devuelve en un string los datos del empleado.
     * @return retorna una linea con los datos del empleado.
     */
    public String mostrarLinea(){
        String linea = this.getCuil()+"   "+this.apeYnom()+"   …………… $ "+this.sueldoNeto();
        if(this.getJefe()!=null){
            linea += " - Responde a: "+this.getJefe().nomYape();
        }else{
            linea += " - Responde a: GERENTE GENERAL";
        }
        return linea;

    }
    /**
     * Determina si el empleado está de aniversario en el mes y día actual.
     * @return true si está de aniversario, false si no.
     */
    public boolean esAniversario(){
        if(this.antiguedad()>0){
            Calendar fechaActual = Calendar.getInstance();
            return (fechaActual.get(Calendar.DAY_OF_MONTH) == this.getFechaIngreso().get(Calendar.DAY_OF_MONTH) && fechaActual.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH));
        }else{
            return false;
        }
    }

}