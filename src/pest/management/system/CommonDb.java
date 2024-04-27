/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pest.management.system;
import java.sql.*;
/**
 *
 * @author Aditya
 */
public class CommonDb {
    static Connection con = null;
    static String url ="jdbc:mysql://localhost/greenrevolution";
    static String user= "admin";
    static String pass ="green";
    
    public static Connection getConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connected.");
        }catch(Exception e){
            
        }
        
        return con;
    }
}
