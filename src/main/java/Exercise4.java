import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args)
    {
        int size=0;

        Scanner key=new Scanner(System.in);
        System.out.println("Enter the size of the triangle: ");
        size=key.nextInt();


        for(int i=0;i<=size;i++)
        {

            for (int k = 0; k < i; k++){
               System.out.print("#");
            }
            System.out.println();
        }


    }
}
