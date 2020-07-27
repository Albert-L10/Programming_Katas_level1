import java.util.Arrays;

public class Exercise7 {

    public static void main(String[] args)
    {
        int[] array1 ={1,2,3,4,5,6};

        int[] array2 ={7,8,9};

        int len1=array1.length;
        int len2=array2.length;
        int [] result=new int[len1+len2];


        System.arraycopy(array1,0,result,0,len1);
        System.arraycopy(array2,0,result,len1,len2);

        System.out.println(Arrays.toString(result));


    }
}
