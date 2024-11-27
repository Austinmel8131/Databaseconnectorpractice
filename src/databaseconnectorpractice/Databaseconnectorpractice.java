/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseconnectorpractice;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author OSAGIE
 */
public class Databaseconnectorpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myKB = new Scanner(System.in);
         try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","1234");
            /*
              CONNECTION NOTES
               1) employees   --> this is the name of the database I am using; your could be different!
               2) root --> this is the user name; there's a good chance you have used root also, but again it might be different
               3) the last part is the user password for the user 'root' that I have; you will have a DIFFERENT password, so you need to use yours!
            */
             System.out.println("Connected to database....");//this is really just to be sure that the code executed :)
            
                         Statement stmt=con.createStatement();  // we can use stmt to run any SQL statement now
             
                           // stmt.execute("Create table IF NOT EXISTS People( personID INT AUTO_INCREMENT PRIMARY KEY, name varchar(50) NOT NULL)");
            
            //String baseInsert = "INSERT INTO People (personID, name) VALUES ( DEFAULT, \'";
            
          /*
            
            for (int i = 0; i< 10; i++){
            
                System.out.println("Please enter a name:");
                String name = myKB.nextLine();
                String dataToInsert = baseInsert.concat(name + "\')");
                
                stmt.execute(dataToInsert);
                
                        
            }*/
            
            //test an SQL query
             System.out.println("");
             }
        catch(SQLException e){
            System.out.println("SQL Error --> ");
             System.out.println(e.getMessage()); //prints out the java error so you can google it :)
             System.out.println(e.getSQLState());//this will print out the exact message from the DB error
         }
         catch (ClassNotFoundException  e){
            
            System.out.println("Class error -- " + e.getMessage());
        }
        }
}
