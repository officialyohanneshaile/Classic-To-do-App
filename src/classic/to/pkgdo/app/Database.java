/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classic.to.pkgdo.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Database {
    static Connection conn;
    static String host = "jdbc:mysql://localhost:3306/TaskManager";
    static String username = "root";
    static String password = "ePi1623Crown!";
    static PreparedStatement stmt;
    /**
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    
    
    public Database() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(host, username, password);
    }
     public static int addTask(NewTask nt) throws SQLException{
        String query = "INSERT INTO ToDo VALUES(?,?,?)";
        stmt = conn.prepareStatement(query); 
        stmt.setString(1, nt.theDate);
        stmt.setString(2, nt.theTime);
        stmt.setString(3, nt.task);
        int result = stmt.executeUpdate();
        return result;
    }
    
    
}
