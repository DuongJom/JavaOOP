package super_keyword;

public class Student extends Person{
    private String name;
    
    Student(int id, String name){
        //Use super in constructor of subclass
        super(id);
        this.name = name;
    }

    public void printInfoOfStudent(){
        //Use super in method of subclass
        super.printInfo();
        System.out.println("Name of student: " + this.name);
    }
}
