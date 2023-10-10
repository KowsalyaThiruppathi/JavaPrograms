/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class CountUnique
{
    public static int getUniqueCharCount(String str){
        StringBuilder temp = new StringBuilder();
	    temp.append(str.charAt(0));
	    for(int i=1;i<str.length();i++){
	        if(temp.indexOf(String.valueOf(str.charAt(i)))==-1)
	        temp=temp.append(str.charAt(i));
	    }
	    System.out.println(temp);
	    return temp.length();
    }
	public static void main(String[] args) {
	    String str ="pradeep";
	    int result = getUniqueCharCount(str);
	    System.out.print(result);
	    
	        
	    
	
	}
}
