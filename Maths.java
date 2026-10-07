import java.util.Scanner;
public class Maths
{
    public static void main(String ar[])
{
    Scanner sc=new Scanner(System.in);
    MathsSample obj1=new MathsSample();
    MathsSample obj2=new MathsSample();
    System.out.println("Enter obj1 or obj2");
    int obj=sc.nextInt();
    System.out.println("Enter 2 values :");
    if(obj==1)
    {
        obj1.num1=sc.nextInt();
        obj1.num2=sc.nextInt();
    }
    else if(obj==2)
    {
        obj2.num1=sc.nextInt();
        obj2.num2=sc.nextInt();
    }
    else
    {
        System.out.println("Enter the valid obj");
        return;
    }
    System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division\nEnter the choice:");
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1:
        System.out.println("The sum is:");
        if(obj==1)
        {
            obj1.addition();
        }
        else if(obj==2)
        {
            obj2.addition();
        }
        break;
        case 2:
        System.out.println("The difference is:");
        if(obj==1)
        {
            obj1.substraction();
        }
        else if(obj==2)
        {
            obj2.substraction();
        }
        break;
        case 3:
        System.out.println("The product is:");
        if(obj==1)
        {
            obj1.multiplication();
        }
        else if(obj==2)
        {
            obj2.multiplication();
        }
        break;
        case 4:
        System.out.println("The quotient is:");
        if(obj==1)
        {
            obj1.division();
        }
        else if(obj==2)
        {
            obj2.division();
        }
        break; 
        default :
        System.out.println("Enter the value from above list");
        return;     
    }
}
}