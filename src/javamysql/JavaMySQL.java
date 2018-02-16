/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamysql;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import ConnectionDB.ConnectionDB;
import java.sql.SQLException;
/**
 *
 * @author hamdan
 */
public class JavaMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Connection db = new ConnectionDB().getConnection();
        Statement statement = db.createStatement();
    }
    
}
