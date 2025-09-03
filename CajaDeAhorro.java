
/**
 * Clase que representa una caja de ahorro bancaria, contiene los atributos: nroCuenta, saldo, 
 * extraccionesPosibles y titular, ademas de los constructres y los accessors, cuenta con metodos
 * que le permiten extraer dinero, depositar dinero y mostrar su estado.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio  
 * @version 24/08/25
 */
public class CajaDeAhorro
{
    // Variables de instancia.
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    /**
     * Constructor que recibe solo NroCuenta y titular, inicializa saldo=0 y extraccionesPosibles= 10
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }
    
    /**
     * Constructor que recibe solo NroCuenta,titular y saldo. inicializa extraccionesPosibles= 10
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
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
    
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
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
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    /**
     * Verifica si se puede realizar la extraccion, si el importe recibido por parametro
     * supera el saldo o ya se hicieron todas las extracciones posibles
     * @param importe que se quiere extraer
     * @return TRUE si: p_importe < saldo y extraccionesPosibles > 0
     */
    private boolean puedoExtraer(double p_importe){
        if((this.getExtraccionesPosibles() == 0) || (p_importe > this.getSaldo())){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Realiza la extraccion, resta el importe a saldo y decrece en 1 las extracciones posibles.
     * @param importe a extraer.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * De ser posible extrae el importe recibido por parametro, si no imprime en pantalla un mensaje acorde.
     * @param importe a extraer e caso de ser posible.
     */
    public void extraer(double p_importe){
        if(this.puedoExtraer(p_importe)){
            this.extraccion(p_importe);
            System.out.println("\n***** Extraccion exitosa *****");
        }else{
            if(this.getExtraccionesPosibles() == 0){
               System.out.println("\n***** No tiene habilitadas mas extracciones! *****");
            }else{
                System.out.println("\n***** No puede extraer mas que el saldo! *****");
            }
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
     * Muestra en pantalla los estados de la caja de ahorro.
     */
    public void mostrar(){
        System.out.println("\n\t- Caja de ahorro -\nNro. Cuenta: "+ this.getNroCuenta() +" - Saldo: "+ this.getSaldo()
                           +"\nTitular: "+ this.getTitular().nomYApe() +"\nExtracciones posibles: "+ this.getExtraccionesPosibles() );
    }
}