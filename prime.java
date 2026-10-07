import java.util.Scanner;
public class prime {
    public static void main(String ar[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    if(num<=1)
    {
        System.out.println("The number " +num+ " is not a prime");
        return ;
    }
    int flag=0;
    for(int i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        System.out.println("The number " +num+ " is not prime");

    }
    else{
        System.out.println("The number "+num+" is prime");
    }
    


}
}
