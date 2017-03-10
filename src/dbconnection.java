/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabrin
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sewar
 */
public class dbconnection {
    
    
    public static Connection getConnection(){
     Connection cn=null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver");
    cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
    }
    catch(ClassNotFoundException | SQLException ex){
                       }
        return cn;
    }
    

    
}
