/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Dell
 */
public class Student {
    private String studentName;
    private String dateOfBirth;
    private String homeTown;
    private int academicYear;
    private int studentId;
    private float CPA;
    private String mayjor;
    private String mail;
    private String phoneNumber;
    private boolean studentStatus;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public float getCPA() {
        return CPA;
    }

    public void setCPA(float CPA) {
        this.CPA = CPA;
    }

    public String getMayjor() {
        return mayjor;
    }

    public void setMayjor(String mayjor) {
        this.mayjor = mayjor;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Student() {
    }

    public Student(String studentName, String dateOfBirth, String homeTown, int academicYear, int studentId, float CPA, String mayjor, String mail, String phoneNumber) {
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
        this.academicYear = academicYear;
        this.studentId = studentId;
        this.CPA = CPA;
        this.mayjor = mayjor;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }
    // Upda1: xoa thuoc tinh status khi khoi tao
    // allow null status trong db: ALTER TABLE Students.dbo.Students_Table ALTER COLUMN Status bit NULL;
    
}
