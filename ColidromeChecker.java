import java.util.*;
public class ColidromeChecker
{
    public static boolean areColidrome(String str)
    {
        String firstHalf = str.substring(0,str.length()/2);
        String secondHalf = str.substring(str.length()/2);
        
        if (firstHalf.equals(new StringBuilder(secondHalf).reverse().toString()))
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.next();
        
        if(areColidrome(str))
        System.out.println("true");
        else
        System.out.println("false");
    }
}