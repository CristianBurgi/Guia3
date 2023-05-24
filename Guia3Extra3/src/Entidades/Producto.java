
package Entidades;

/**
 *
 * @author Cristian
 */
public class Producto {
    private String descripcion;
    private double precioLista;
    private int stock;
    private String tipoProducto;

    public Producto(String descripcion, double precioLista, int stock, String tipoProducto) {
        this.descripcion = descripcion;
        this.precioLista = precioLista;
        this.stock = stock;
        this.tipoProducto = tipoProducto;
    }

    public Producto() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", precioLista=" + precioLista + ", stock=" + stock + ", tipoProducto=" + tipoProducto + '}';
    }
    
    public double calcularPrecioPublico(){
        if ("lacteo".equals(tipoProducto)) {
            precioLista= precioLista*1.25;
            
        }else if ("limpieza".equals(tipoProducto)) {
            precioLista=precioLista*1.35;
            
        }else
            precioLista=precioLista*1.45;
        
        return precioLista;
    }
    

}
