package cau1.privatemodifier;

public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Teacher");
        //Below statement will throw error because "name" property is private in Teacher class
        System.out.println(teacher.name);
    }
}
