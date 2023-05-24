
package guia3extra3;


import Entidades.Cliente;
import Entidades.Producto;
import Entidades.Vendedor;
import Negocio.Venta;
/**
 *
 * @author Cristian
 */
public class Guia3Extra3 {

   
    public static void main(String[] args) {
        Producto p1 =new Producto("leche", 300 , 10, "lacteo");
        Producto p2 =new Producto();
        Producto p3 =new Producto();
        
        Cliente c1=new Cliente("Pascual","san luis");
        Vendedor v1= new Vendedor("El Baratioli", "20-324123421-2");
        
        Venta venta1 =new Venta(1, p1, p2, p3, c1, v1);
        
       
       venta1.calcularTotal();
        
        
       
    }

}
