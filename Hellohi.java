public class Hellohi
{
    int b;
    static int a=10;
    public static void main(String ar[])
    {
        System.out.println(a);
        Hellohi hi=new Hellohi();
        Hellohi hi1=new Hellohi();
        hi.b=100;
        hi1.b=200;
        hi.a=500;
        hi1.a=400;
        System.out.println(hi.b);
        System.out.println(hi1.b);
        System.out.println(hi.a);
        System.out.println(hi1.a);
    }
}