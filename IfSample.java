import java.util.Scanner;
public class IfSample
{
    public static void main (String ar[])
    {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=S.nextInt();
        if(num<0)
        {
            System.out.println("THe number is Negative");
        }
        else
        {
            System.out.println("The number is Positive");
        }


        

    }
}