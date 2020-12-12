/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevice;

import Entity.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class TestFeature {
    public static void main(String[] args){
        Statement statement = null;
        Student insertStudent = new Student("Viet An", "01/02/2000", "hy", 63, 2018, (float) 0.0, "set", "mail@mail.com", "0123123");
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Students;user=sa;password=123123;");
 
        System.out.println("Connected to database !");
     
        statement = connection.createStatement();
        String sql = "insert into Students.dbo.Students_Table (Name, DateOFBirth, HomeTown, AcademicYear, ID, CPA, Mayjor, Mail, PhoneNumber) values ('"+
                 insertStudent.getStudentName() + "','" 
                + insertStudent.getDateOfBirth() +"','" 
                + insertStudent.getHomeTown() + "'," 
                + insertStudent.getAcademicYear() + "," 
                + insertStudent.getStudentId() + "," 
                + insertStudent.getCPA() + ",'" 
                + insertStudent.getMayjor() + "','" 
                + insertStudent.getMail() + "','" 
                + insertStudent.getPhoneNumber() + "');";
        statement.execute(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            }
        }
        catch(SQLException sqle) {
        System.out.println("Sql Exception :"+sqle.getMessage());
        }
        catch(ClassNotFoundException e) {
        System.out.println("Class Not Found Exception :" + e.getMessage());
        }
    }
}
