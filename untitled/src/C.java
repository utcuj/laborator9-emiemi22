public class C extends B {
    private int x ;
    public C(int x , int y , int z)
    {
        super(x,y);
        this.x = z ;
    }
    public void conditieMaiMici100(int x , int y , int z) throws Exceptie1 {
        super.conditieMaiMici100(x , y);
        if (z < 100)
            throw new Exceptie3("Numarul din c este mai mic decat 100");
        else
        {
            System.out.println("Numarul din C este mai mare decat 100");
        }
    }
    public int getC(){
        return x;
    }
}
