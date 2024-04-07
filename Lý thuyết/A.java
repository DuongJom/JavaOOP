public class A {
    private int x;
    public static int count1 = 0;
    public int count2 = 0;
    public A(int x) {
     //TO IMPLEMENT
     this.x=x;
     System.out.println("Ctor of A");
     A.count1++;
     count2++;
    }

    public A(A xyz){
        this.x=xyz.x;
        this.count1=xyz.count1;
        this.count2=xyz.count2;
    }
    }
    