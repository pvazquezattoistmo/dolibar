/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class ConexionBaseDatos {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost/dolibarr?useSSL=false&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "adminasdasdasd";
    
    private static Connection conn;
    
    public static Connection getInstance() throws SQLException{
        if (conn == null){
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        }
        return conn;
    }
    
}
