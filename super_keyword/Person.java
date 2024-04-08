package super_keyword;

public class Person {
    private int id;

    Person(int id){
        this.id = id;
    }

    public void printInfo(){
        System.out.println("Id of person: " + this.id);
    }
}
