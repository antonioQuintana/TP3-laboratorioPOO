import java.util.Scanner;
import java.util.*;
/**
 * Clase ejecutable que instancia y prueba los metodos de las clases 
 * CuentaCorriente y CajaDeAhorro
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 24/08/25
 */

public class Banco
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n"); //Permite ingresar cadenas separadas por espacio
        
        //Primero ingreso los datos necesarios para instanciar un objeto tipo Persona
        System.out.println("\nIngrese su DNI: ");
        int nroDni = teclado.nextInt();
        System.out.println("\nIngrese su Nombre: ");
        String nombre = teclado.next();
        System.out.println("\nIngrese su Apellido: ");
        String apellido = teclado.next();
        
        System.out.println("\nIngrese su Año de nacimiento: ");
        int anioNacimiento = teclado.nextInt();
        System.out.println("\nIngrese su Mes de nacimiento: ");
        int mesNacimiento = teclado.nextInt() - 1; //los meses empiezan en cero.
        System.out.println("\nIngrese su dia de nacimiento: ");
        int diaNacimiento = teclado.nextInt();
        
        Calendar fechaNacimiento = new GregorianCalendar();
        fechaNacimiento.set(Calendar.YEAR, anioNacimiento);
        fechaNacimiento.set(Calendar.MONTH, mesNacimiento);
        fechaNacimiento.set(Calendar.DAY_OF_MONTH, diaNacimiento);
        
        //Instancio unaPersona con estos datos como parametros
        Persona unaPersona = new Persona(nroDni, nombre, apellido, fechaNacimiento);
        //Ingreso datos para instanciar una CuentaCorriente
        
        if(unaPersona.esCumpleaños()){
            System.out.println("\n***** Feliz Cumpleaños *****");
        }else{
            System.out.println("\n***** NO Feliz Cumpleaños *****");
        }
        
        System.out.println("\nIngrese el Nro de Cuenta de su cuenta corriente: ");
        int nroCuenta = teclado.nextInt();
        System.out.println("\nIngrese el saldo de su cuenta corriente: ");
        double saldo = teclado.nextDouble();
        //CuentaCorriente con todos los parametros
        CuentaCorriente unaCuenta = new CuentaCorriente(nroCuenta, unaPersona, saldo);
        System.out.println("\nCuanto desea depositar? : ");
        unaCuenta.depositar(teclado.nextDouble());
        
        System.out.println("\nCuanto desea extraer? : ");
        unaCuenta.extraer(teclado.nextDouble());
        unaCuenta.mostrar();
        
        //Instancio otra cuenta sin parametro saldo ( sera 0) para que la extraccion no sea posible
        System.out.println("\nIngrese otro Nro de Cuenta para una nueva cuenta corriente: ");
        nroCuenta = teclado.nextInt();
        CuentaCorriente otraCuenta = new CuentaCorriente(nroCuenta, unaPersona);
        System.out.println("\nCuanto desea extraer? : ");
        otraCuenta.extraer(teclado.nextDouble());
        otraCuenta.mostrar();
        
        //Con los mismos datos instancio una caja de ahorro
        System.out.println("\nIngrese otro Nro de Cuenta para una Caja de Ahorro: ");
        nroCuenta = teclado.nextInt();
        System.out.println("\nIngrese el saldo de su caja de ahorro: ");
        saldo = teclado.nextDouble();
        CajaDeAhorro unaCaja = new CajaDeAhorro(nroCuenta, unaPersona, saldo);
        System.out.println("\nCuanto desea depositar en su caja de ahorro? : ");
        unaCaja.depositar(teclado.nextDouble());
        System.out.println("\nCuanto desea extraer de su caja de ahorro? : ");
        unaCaja.extraer(teclado.nextDouble());
        unaCaja.mostrar();
        
        //Instancio otra caja sin parametro saldo (sera 0) para que la extraccion no sea posible
        System.out.println("\nIngrese otro Nro de Cuenta para una nueva cuenta corriente: ");
        nroCuenta = teclado.nextInt();
        CajaDeAhorro otraCaja = new CajaDeAhorro(nroCuenta, unaPersona);
        System.out.println("\nCuanto desea extraer? : ");
        otraCaja.extraer(teclado.nextDouble());
        otraCaja.mostrar();
    }
}