
/**
 * Clase que representa una cuenta corriente bancaria, contiene los atributos: nroCuenta, saldo,
 * limiteDescubierto y titular, ademas de los constructres y los accessors, cuenta con metodos
 * que le permiten extraer dinero, depositar dinero y mostrar su estado.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 24/08/25
 */
public class CuentaCorriente
{
    // Variables de instancia.
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Constructor que recibe solo NroCuenta y titular, inicializa saldo=0 y limiteDescubierto= 500
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
        this.setTitular(p_titular);
    }
    
    /**
     * Constructor que recibe solo NroCuenta,titular y saldo. inicializa limiteDescubierto= 500
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
        this.setTitular(p_titular);
    }
    
    //Setters
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    //Getters
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Verifica si se puede realizar la extraccion, si el importe recibido por parametro NO 
     * supera el saldo mas el limiteDescubierto
     * @param importe que se quiere extraer
     * @return TRUE si: p_importe < (saldo + limiteDescubierto)
     */
    private boolean puedoExtraer(double p_importe){
        if(p_importe > (this.getSaldo() + this.getLimiteDescubierto())){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Realiza la extraccion, en caso de que el importe sea mayor al saldo, saldo queda en 0 y se resta lo que corresponde
     * a limiteDescubierto. Si el importe no es mayor a saldo simplemente se le resta a este.
     * @param importe a extraer.
     */
    private void extraccion(double p_importe){
        if(p_importe > this.getSaldo()){
            this.setLimiteDescubierto(this.getSaldo() - p_importe);
            this.setSaldo(0);
        }else{
            this.setSaldo(this.getSaldo() - p_importe);
        }
    }
    
    /**
     * Recibe un importe a extraer, mediante el metodo puedoExtraer() verifica si es posible, en caso de serlo realiza
     * la extraccion con el metodo extraccion(), si no imprimer en pantalla un mensaje acorde.
     * @param importe a extraer e caso de ser posible.
     */
    public void extraer(double p_importe){
        if(this.puedoExtraer(p_importe)){
            this.extraccion(p_importe);
            System.out.println("\n***** Extraccion exitosa *****");
        }else{
            System.out.println("\n***** El importe de extraccion sobrepasa el límite de descubierto! *****");
        }
    }
    
    /**
     * Agrega un importe al saldo actual
     * @param importe que se sumara al saldo
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        System.out.println("\n***** Se deposito correctamente *****");
    }
    
    /**
     * Muestra en pantalla los estados de la cuenta corriente.
     */
    public void mostrar(){
        System.out.println("\n\t- Cuenta Corriente -\nNro. Cuenta: "+ this.getNroCuenta() +" - Saldo: "+ this.getSaldo()
                           +"\nTitular: "+ this.getTitular().nomYApe() +"\nDescubierto: "+ this.getLimiteDescubierto() );
    }
}
