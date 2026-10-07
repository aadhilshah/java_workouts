import java.util.Scanner;
public class argument
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sum(a,b);
        System.out.println("The sum of number is:"+c);
    }
    static int sum(int num1,int num2)
    {
        int result=num1+num2;
        return result;



    }
}