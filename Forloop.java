import java.util.Scanner;
public class Forloop
{
    public static void main (String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter"+size+"number:");
        int[]num=new int[size];
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=num[i];
        }
        System.out.println("The sum of numbers is"+sum);


    }

}