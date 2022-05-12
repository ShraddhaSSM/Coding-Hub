import java.util.*;
public class Frequency
 {

    public static void main(String args[])
    {
        String str = "I am Shraddha";
        char ch = 'd';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(ch == str.charAt(i)) 
            {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}