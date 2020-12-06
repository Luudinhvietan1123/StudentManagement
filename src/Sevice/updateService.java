/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anhaa
 */
public class updateService {
    public boolean checkStudentExist(int studentId) {
       boolean checkResult = false;
        Statement statement = null;
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SinhVien;user=sa;password=123456;");

        //System.out.println("Connected to database !");
    
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
        ResultSet.CONCUR_UPDATABLE);
        String sql = "select * from SinhVien.dbo.Table_1";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
           
            
            
            //System.out.println(resultSet.getString(1));
            //System.out.println(resultSet.getString(2));
            
            }
        }
        catch(SQLException sqle) {
        //System.out.println("Sql Exception :"+sqle.getMessage());
        }
        catch(ClassNotFoundException e) {
        //System.out.println("Class Not Found Exception :" + e.getMessage());
        }
        
        return checkResult;
    }
}
