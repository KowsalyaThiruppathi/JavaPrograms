import java.util.*;
public class AnagramChecker
{
    public static boolean areAnagrams(String str1,String str2)
    {
        if(str1.length() != str2.length())
        {
        return false;
        }
        
        str1 = str1.replaceAll("\\s"," ").toLowerCase();
        str2 = str2.replaceAll("\\s"," ").toLowerCase();
              
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1,charArray2);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = new String();
		str1 = sc.next();
		String str2 =new String();
		str2 = sc.next();
		if(areAnagrams(str1,str2))
		System.out.println("true");
		else
		System.out.println("false");
		
	}
}
