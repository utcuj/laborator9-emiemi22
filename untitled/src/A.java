public class A {
    private int x ;
    public A(int x)
    {
        this.x = x ;
    }
    public void conditieMaiMici100(int x) throws Exceptie1 {
        if (x < 100)
            throw new Exceptie1("Numarul din a este mai mic decat 100");
        else
        {
            System.out.println("Numarul din a este mai mare decat 100");
        }
    }
    public int getA(){
        return x;
    }
}
