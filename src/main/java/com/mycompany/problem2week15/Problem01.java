
package com.mycompany.problem2week15;
import java.util.ArrayList;
import java.util.List;






public class Problem01 {  
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        
        Student std1 = new Student("sam","mule",1001);
        Student std2 = new Student("ben","smith",1002);
        Student std3 = new Student("tims","pick",1003);
  
        ls.add(std1);ls.add(std2);ls.add(std3);
        
        for(Student s: ls){
            System.out.println(s);
        }  
    }   
}
class Student{
    String fname;
    String lname;
    int id;

    public Student() {
        this.fname = "";
        this.lname = "";
        this.id = 0;
        
    }

    public Student(String fname, String lname, int id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;    
    }

    public String getFname() {
        return fname;
    }
    
    public String getLname() {
        return lname;
    }

    public int getId() {
        return id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "fname=" + fname + ", lname=" + lname + ", id=" + id + '}';
    }  
}
