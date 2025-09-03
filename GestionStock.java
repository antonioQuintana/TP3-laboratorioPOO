
/**
 * Clase ejecutable, en la que se instancia y prueban todos los metodos
 * de la clase Producto.
 * 
 * @author Pannunzio M. Nicolas - Quintana R. J. Antonio
 * @version 21/08/25
 */
public class GestionStock
{
    public static void main(String[] args){
        Laboratorio unLaboratorio = new Laboratorio("Labs S.A.", "Av. Maipu 333", "54-379-4888444", 1000, 15);
        Producto unProducto = new Producto(1111, "Perfumeria", "Antonio B.", 150, 30, 100, unLaboratorio);
        System.out.println(unProducto.mostrarLinea());//Muestra el precio de lista y el precio al contado.

        unProducto.ajuste(500); // se asigna 500 al stock.
        unProducto.mostrar();   //Muestra en pantalla la mayoria de los datos del producto.

        unProducto.ajuste(-200);// resta 200 al stock.
        unProducto.mostrar();   //Muestra nuevamente el estado actual.
        System.out.println(unProducto.mostrarLinea());//Muestra el precio de lista y el precio al contado.
        
        //Para probar exaustivamente los metodos de la clase Producto...
        System.out.println(unProducto.mostrarPtoRepoYExistMin());
        unProducto.ajustarPtoRepo(25); //Asigna 25 a porcPtoRepo.
        unProducto.ajustarExistMin(50);//Asigna 50 a existMinima.
        System.out.println(unProducto.mostrarPtoRepoYExistMin());//muestra el estado actual de esos atributos.
        
    }
}