/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hamdan
 */
public class ConnectionDB {
    
    private Connection db;
    private String driverName = "com.mysql.jdbc.Driver";
    private String protocol = "jdbc:mysql";
    private String host = "localhost";
    private String port = "3306";
    private String database = "javaMySQL";
    private String urlDatabaseConnection = protocol + "://" + host + ":" + port + "/" + database;
    private String username = "root";
    private String password = "1122";
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        
        if (db == null) {
            Class.forName(driverName);
            db = DriverManager.getConnection(urlDatabaseConnection, username, password);
        }
        
        return db;
    } 
}
