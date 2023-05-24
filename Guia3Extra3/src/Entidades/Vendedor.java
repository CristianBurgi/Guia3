
package Entidades;

/**
 *
 * @author Cristian
 */
public class Vendedor {
    private String comercio;
    private String cuit;

    public Vendedor(String comercio, String cuit) {
        this.comercio = comercio;
        this.cuit = cuit;
    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    
    

}
