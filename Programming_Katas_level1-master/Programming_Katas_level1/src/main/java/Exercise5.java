import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args)
    {

        Scanner key=new Scanner(System.in);
        System.out.println("Enter the size of the triangle: ");
        int size = key.nextInt();

        for(int i=0;i<=size;i++)
        {

            for(int j=size;j>=i;j--) {
                System.out.append(" ");
            }
            for (int k = 1; k <= i; k++) {

                    System.out.print("#");
                }
                System.out.println();
            }


    }

}
