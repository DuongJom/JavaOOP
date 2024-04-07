public class B extends A {
    protected int y;
    private int z;
    public B(int x, int y, int z) {
     // TO IMPLEMENT
        super(x);
        this.y=y;
        this.z=z;
        System.out.println("Ctor of B");
    }
    }