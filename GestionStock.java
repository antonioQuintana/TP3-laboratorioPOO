
/**
 * Write a description of class GestionStock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionStock
{
    public static void main(String []args){
        Laboratorio labo1 = new Laboratorio("Drogueria Antoñito", "Rivadavia 1578", "3794395882");
        
        Producto producto1 = new Producto(121212, "Antibioticos", "Ibupirac 800", 750, labo1);
        producto1.mostrar();
        System.out.println(producto1.mostrarLinea());
        System.out.println("El porcentaje PtoRepo es: " + producto1.getPorcPtoRepo());
        System.out.println("La existencia minima es:"+ producto1.getExistMinima()+"\n");
        
        producto1.ajuste(300);
        producto1.ajustarPtoRepo(10);
        producto1.ajustarExistMin(100);
        
        producto1.mostrar();
        System.out.println(producto1.mostrarLinea());
        System.out.println("El porcentaje PtoRepo es: " + producto1.getPorcPtoRepo());
        System.out.println("La existencia minima es:"+ producto1.getExistMinima()+"\n");
        
        //simulando baja de 200 productos
        System.out.println("Simulando la baja de 200 productos");
        producto1.ajuste(-200);
        producto1.mostrar();
        System.out.println(producto1.mostrarLinea());
        System.out.println("El porcentaje PtoRepo es: " + producto1.getPorcPtoRepo());
        System.out.println("La existencia minima es:"+ producto1.getExistMinima()+"\n");
        
    }
}