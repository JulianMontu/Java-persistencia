package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection get_Connection(){
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");

        }catch (Exception e){

        }

        return conection;
    }
}
