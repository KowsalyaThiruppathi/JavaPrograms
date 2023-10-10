import java.util.*;
class MinDeciBinary
{
    public static int getMin(String str){
        int result = 0;//initialize result
        for(int i=0;i<str.length();i++)//generate a loop from first to last char of string
        {
            char c = str.charAt(i);//get each char from string
            int current = c-48;//convert char into int
            if(current>result)//when current value is greater the result
            {
                result=current;//assign current value to result
            }

        }
    return result;

    }
    public static void main(String[] args) 
    {
        MinDeciBinary obj = new MinDeciBinary();
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.next(); 
        int ans = obj.getMin(str);
        System.out.println(ans);
    }
}