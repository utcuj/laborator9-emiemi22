public class Mainn {
    public static void main (String[] args)
    {
        C numar = new C(10 , 101 ,10);
        try{
            numar.conditieMaiMici100(numar.getA() , numar.getB() , numar.getC());
        }
        catch (Exceptie1 e)
        {
            System.out.println(e.getMessage());
        }
    }
}
