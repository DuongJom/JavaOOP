package cau1.protectedmodifier.main;

import cau1.protectedmodifier.model.Student;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Student");
        //Below statement will throw error because "name" property is protected in Student class
        System.out.println(student.name);
        
    }
}
