package static_example;

public class Main {
    public static void main(String[] args){
        //Call static properties from class A
        System.out.println("value of static property: " + A.count1);

        //Call non-static properties from class A
        A a = new A();
        System.out.println("value of non-static property: " + a.count2);
    }
}
