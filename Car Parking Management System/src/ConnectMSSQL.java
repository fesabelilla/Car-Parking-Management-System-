 import java.sql.Connection;  
 import java.sql.DriverManager;  
 import java.sql.ResultSet;  
 import java.sql.Statement;  

public class ConnectMSSQL {  
 
     public void connectDB(){  
         try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager  
                     .getConnection(  
                             "jdbc:sqlserver://localhost:1433;databaseName=Car_Parking_Management_System;selectMethod=cursor",   "sa", "123456");  
   
            // System.out.println("DATABASE NAME IS:"  
              //       + connection.getMetaData().getDatabaseProductName());  
             //Statement statement = connection.createStatement();  
             //ResultSet resultSet = statement  
               //      .executeQuery("SELECT FirstName FROM Customer");  
             //while (resultSet.next()) {  
               //  System.out.println("Customer NAME:"  
                 //        + resultSet.getString("FirstName"));  
             //}  
         } 
         catch (Exception e) {  
             e.printStackTrace();  
         }  
     } 

 }  