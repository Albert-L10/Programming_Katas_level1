import java.util.ArrayList;

public class Exercise6 {

    public static void main(String[] args) {


        String words[]= {"once", "upon", "quick", "brown", "fox", "ate", "my"};


       String longestWords=longest(words);

        System.out.println("The longest word in our array is: "+longestWords);
    }

    public static String longest(String[] array) {

        int element = 0;
        String longer = null;

        for (String s : array) {

            if (s.length() > element && s.length()==s.length())
            {
                element = s.length();
                longer = s;
            }

        }
        return longer;

    }
}
