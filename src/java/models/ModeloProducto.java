
package models;

import classes.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ModeloProducto extends Conexion{

 public ArrayList<Producto>getAllProductos(){

 ArrayList<Producto>productos=new ArrayList<>();
     PreparedStatement pst=null;
     ResultSet rs=null;
     try {
        String sql="select * from productos";
        pst=getConexion().prepareCall(sql);
        rs=pst.executeQuery();
        
        while(rs.next()){
          productos.add(new Producto(rs.getInt("id_producto"),rs.getString("nombre"),rs.getString("img_producto"),rs.getInt("id_categoria"),rs.getDouble("precio"),rs.getInt("stock")));
          
}

     } catch (Exception e) {
     }finally{
         try {
             if(pst!=null){
            pst.close();
            }if(rs!=null){
            rs.close();
            }if(getConexion()!=null){
            getConexion().close();
            }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }


}

 return productos;
}

public Producto getProducto(int id){
     Producto producto=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
     try {
        String sql="call selectProducto(?)";
        pst=getConexion().prepareCall(sql);
        pst.setInt(1, id);
        rs=pst.executeQuery();
        
        while(rs.next()){
          producto=(new Producto(rs.getInt("id_producto"),rs.getString("nombre"),rs.getString("img_producto"),rs.getInt("id_categoria"),rs.getDouble("precio"),rs.getInt("stock")));
          
}

     } catch (Exception e) {
     }finally{
         try {
             if(pst!=null){
            pst.close();
            }if(rs!=null){
            rs.close();
            }if(getConexion()!=null){
            getConexion().close();
            }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }


}
return producto;

}
}
