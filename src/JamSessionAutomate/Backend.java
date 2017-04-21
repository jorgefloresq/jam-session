package JamSessionAutomate;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcontreras
 */
public class Backend {
    private static String CONNECTION;
    private static String DRIVER;
    
    private static Connection connection;
    private static Statement statement;
    
    public static void connectDB() {
         DRIVER = "com.mysql.jdbc.Driver";
         CONNECTION = "jdbc:mysql://localhost:3306";
        
        try {
            //Recommended way of loading a driver using DriverManager framework
            Class.forName(DRIVER).newInstance();
        } 
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e){
            e.printStackTrace();
        }
        
        try{
            connection = DriverManager.getConnection(CONNECTION,"root","root");
            statement = connection.createStatement();
            statement.executeUpdate("USE Musicloops;");
          
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public static String getChordPath(String instrument,String type, String chord){
        
        String path = "error";
        String query = "SELECT path FROM "+instrument+" "
                    + "WHERE type = \""+type+"\" AND chord = \""+chord+"\";";
        try{
            statement.executeUpdate("USE Musicloops;");
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                path = rs.getString("path");
            }
          
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return path;
    }
    
    public static String getDrumVariationPath(String type, String variation){
        String path = "error";
        String query = "SELECT path FROM drums "
                    + "WHERE type = \""+type+"\" AND variation = \""+variation+"\";";
        try(Connection connection = DriverManager.getConnection(CONNECTION,"root","root"); 
            Statement statement = connection.createStatement()){
            statement.executeUpdate("USE Musicloops;");
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                path = rs.getString("path");
            }
          
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return path;
    }
    public static void verifyFilesExist(String inst){ 
        try{
            statement.executeUpdate("USE musicloops;");
        
            String query = "SELECT * FROM "+inst+"";
        
            ResultSet rs = statement.executeQuery(query); 
            while(rs.next()){
                File fl = new File(rs.getString("path"));
                if(!fl.exists()){
                   System.out.println(rs.getString("path")+ " was not found!");
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void addChordToDb(String inst,String path,String var,String chord){
        
        try{
        statement.executeUpdate("USE musicloops;");
        
        String query = "insert into "+inst+" values  ('"+path+"', '"+var+"','"+chord+"')";
        
        statement.executeUpdate(query); 
        }
        
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void addBeatToDb(Integer dur, String path,String var,String order){
        
        try{
        statement.executeUpdate("USE musicloops;");
        
        String query = "insert into drums values  ('"+dur+"', '"+path+"', '"+var+"','"+order+"')";
        
        statement.executeUpdate(query); 
        }
        
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void removeVariation(String table, String variation){
        try{
            statement.executeUpdate("USE musicloops;");
            String query = "DELETE from "+table+" where type = '"+variation+"';";
            statement.executeUpdate(query); 
            
            System.out.println("Deleted "+variation+" succesfully!");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
}
