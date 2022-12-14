
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
1) Lo que vamos hacer  es crear una clase y le vamos a asignar los atributos 
como por ejemplo el usuario, la clave, la url de donde esta nuestra base de datos y poder hacer la conexion 
*/

public class Conexion {
    
    private final String database="carritojsp";
    private  final String servidor="jdbc:mysql://localhost:3306/"+ database;
    private final String username="root";
    private final String clave ="123456789";
    private  Connection cn=null; 

    //Creamos un contructor 
public Conexion(){
//hacemos un try catch 
    try {
//En el try hacemos un clas.forname del driver de la version 8.0
        Class.forName("com.mysql.cj.jdbc.Driver");
/*en la variable que creamos que se llama cn , despues almacenamos el DriverManager en el cual va a verificar nuestro
url donde esta la base de datos, usuario y la clave con un metodo getConnection
*/
        this.cn=DriverManager.getConnection(servidor,username,clave);
        System.out.println("Conexion establecida exitosamente");
        
    } catch (ClassNotFoundException e) {
        System.err.println("Error "+e.getMessage());
    }catch(SQLException e){
        System.err.println("Error "+e.getMessage());
}
        
}
/*Creamos un metodo Connection para que  nos muestre la Conexion 
en este caso el metodo se va a llamar getConexion y os va aretornar el cn en
el cual es la variable donde se alamacena nuestra "conexion"*/
public Connection getConexion(){
    return this.cn;
}

}
        
