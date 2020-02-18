import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args)
    {
        int size=0;

        Scanner key=new Scanner(System.in);
        System.out.println("Enter the size of thr box: ");
        size=key.nextInt();

        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++)
            {
                System.out.print("#");
            }
            System.out.println("#");
        }

    }

}
