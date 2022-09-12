
package models;

import classes.Producto;


public class App {
    public static void main(String[] args) {
        ModeloProducto mp=new ModeloProducto();
        for (Producto p :mp.getAllProductos()) {
            System.out.println(p.getNombre());
            
        }
    }
  

    
}
