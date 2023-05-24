
package Negocio;
import Entidades.Cliente;
import Entidades.Producto;
import Entidades.Vendedor;

/**
 *
 * @author Cristian
 */
public class Venta {
    private int id;
    private Producto p1;
    private Producto p2; 
    private Producto p3;
    private Cliente c1;
    private Vendedor v1;

    public Venta(int id, Producto p1, Producto p2, Producto p3, Cliente c1, Vendedor v1) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.c1 = c1;
        this.v1 = v1;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    
    public void calcularTotal(){
        
       
      
       
        double suma= p1.calcularPrecioPublico()+p2.calcularPrecioPublico()+p3.calcularPrecioPublico();
        
        if (c1.getProvincia().equalsIgnoreCase("San Luis")){
            suma -= (suma*0.1);
            System.out.println("Ticket\n $"+suma );
        }else {
            suma -= (suma*0.15);
            System.out.println("Ticket\n $"+suma );
        }
            
        
    }
    
}
