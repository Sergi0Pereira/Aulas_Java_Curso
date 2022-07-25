/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conn;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;



public final class dbUtil {
    
    private static Connection conn = null;

    private static Properties getDbInfo() { // get the database information from the properties file
        Properties prop = new Properties(); // create a new properties object

        try {
            InputStream stream = new FileInputStream("./resources/config.properties"); // get the input stream from the properties file

            prop.load(stream);// load the properties file

        } catch (FileNotFoundException ex) { // if the properties file is not found
            System.out.println("Ficheiro de configuracao nao encontrado!");
        } catch (IOException ex) { // if the properties file is not found
            System.out.println("Sem acesso ao ficheiro de configuracao");
        }

        return prop; // return the properties object
    }

    public static Connection getConnection() { 
        final Properties prop = dbUtil.getDbInfo(); // get the database information from the properties file
        
        //final String DB_URL= "jdbc:mysql://"+ prop.getProperty("db.host")+ ":"+ prop.getProperty("db.port")+ "/"+prop.getProperty("db.name"); // get the database url from the properties file
        final String DB_URL= "jdbc:mysql://localhost:3306/booksdb"; 
        try {
            if(conn==null){ // if the connection is closed
                conn = DriverManager.getConnection(DB_URL,"root",""); // get a connection to the database
            }
        } catch (SQLException ex) {
           
            System.out.println("Can´t connect to the database!");
            System.out.println(ex);
        }

        //System.out.println(prop.getProperty("db.name")); // print the database name
        
        return conn; // return the connection to the database
    }
    /*public static void closeConnection(Connection conn){
        try {
            if(conn.isClosed()==false){
                conn.close();
                System.out.println("Ligacao encerrada com sucesso!");
            }
        } catch (SQLException ex) {
            System.out.println("Falhou o encerramento da ligacao!");
        }
    }*/
}
