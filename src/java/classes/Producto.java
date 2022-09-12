
package classes;


public class Producto {

  
    private int id;
    private String nombre;
    private String URLimg;
    private int categoria;
    private double stock;
    private int precio;



  public Producto() {
    }

    public Producto(int id, String nombre, String URLimg, int categoria, double stock, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.URLimg = URLimg;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getURLimg() {
        return URLimg;
    }

    public void setURLimg(String URLimg) {
        this.URLimg = URLimg;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    
}
