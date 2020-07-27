import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args)
    {

        Scanner key=new Scanner(System.in);
        System.out.println("Enter the size of thr box: ");
        int size = key.nextInt();

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
