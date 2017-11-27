import java.util.*;

public class StringTest14
{
    public static void main (String [] args)
    {
     Scanner input = new Scanner(System.in);

     System.out.println("Enter two words:");
     String word1=input.next();
     String word2=input.next();
     System.out.println("The two words are:");
     System.out.println("   \""+word1+"\"");
     System.out.println("   \""+word2+"\"");
     System.out.println("Testing them for equality using == gives: "+(word1==word2));
     System.out.println("Testing them for equality using equals gives: "+word1.equals(word2));
    }
}
