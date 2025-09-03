import java.util.Scanner;//Permite ingresar datos por teclado
/**
 * Clase ejecutable de CuentaBancaria.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 24/08/25
 */

public class CrearCuentaBancaria
{
    /**
     * Instancia objetos de la clase CuentaBancaria y prueba todos sus metodos 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);//Creo un objeto de clase Scanner con el que ingresar datos por teclado
        
        //Primero ingreso los datos necesarios para instanciar un objeto tipo Persona
        System.out.println("\nIngrese su DNI: ");
        int nroDni = teclado.nextInt();
        System.out.println("\nIngrese su Nombre: ");
        String nombre = teclado.next();
        System.out.println("\nIngrese su Apellido: ");
        String apellido = teclado.next();
        System.out.println("\nIngrese su Año de nacimiento: ");
        int anioNacimiento = teclado.nextInt();
        
        //Instancio unaPersona con estos datos como parametros
        Persona unaPersona = new Persona(nroDni, nombre, apellido, anioNacimiento);
        
        //Ingreso por teclados los otros datos necesarios para instanciar la cuenta
        System.out.println("\nIngrese su Nro de Cuenta: ");
        int nroCuenta = teclado.nextInt();
        //Instancio una cuenta sin saldo
        CuentaBancaria unaCuenta = new CuentaBancaria(nroCuenta, unaPersona);
        
        unaCuenta.mostrar();
        
        System.out.println("\nDeposite Saldo: $");
        System.out.println("\nSaldo Actual: $"+ unaCuenta.depositar(teclado.nextDouble()));
        
        //Ingreso datos para instanciar otra cuenta
        System.out.println("\n\nIngrese su nuevo Nro de Cuenta: ");
        nroCuenta = teclado.nextInt();
        System.out.println("\nIngrese su saldo actual: ");
        double saldo = teclado.nextDouble();
        //Instancio otraCuenta con la misma Persona, distinto nroCuenta y le agrego saldo
        CuentaBancaria otraCuenta = new CuentaBancaria(nroCuenta, unaPersona, saldo);
        
        System.out.println("\nExtraiga Saldo: $");
        System.out.println("\nSaldo Actual: $"+ otraCuenta.extraer(teclado.nextDouble()));
        System.out.println(otraCuenta.toString());
    }
}