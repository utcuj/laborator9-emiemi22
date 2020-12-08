public class B extends A {
    private int x ;
    public B(int x,int y)
    {
        super(x);
        this.x = y ;
    }
    public void conditieMaiMici100(int x , int y) throws Exceptie1 {
        super.conditieMaiMici100(x);
        if (y < 100)
            throw new Exceptie2("Numarul din b este mai mic decat 100");
        else
        {
            System.out.println("Numarul din b este mai mare decat 100");
        }
    }
    public int getB(){
        return x;

    }
}
