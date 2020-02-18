import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args)
    {
        even_odd();
    }
    public static void even_odd()
    {
        int num=0;

        Scanner key=new Scanner(System.in);
        System.out.println("Enter any number: ");
        num=key.nextInt();

        if(num%2==0)
        {
            System.out.println("your number "+num+" is even");
        }
        else
        {
            System.out.println("your number "+num+" is odd");
        }
    }


}
