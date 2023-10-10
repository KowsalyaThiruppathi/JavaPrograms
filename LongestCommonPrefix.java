class LongestCommonPrefix {
    public static String getCommonPrefix(String[] strs) {
        if(strs.length==1)//if one string is present in array then return the string
        return strs[0];
        
        else
        {
        String temp = strs[0];//store the first string of array in a variable
        int lcp=0;//to compare characters among strings in array create a variable to increment after checking each time
        StringBuilder res = new StringBuilder();//intialize a string builder object to store lcp
        for(int i =0;i<strs.length;i++)//generate a loop in which j is from 0 to less than length of temp
        {
            boolean isPrefixSame=true;//set boolean variable to true
            for(int j =0;j<temp.length();j++)//generate a loop in which i is from 1 to less than length of strs[]
            {
               if(!(lcp < strs[i].length() && temp.charAt(lcp) == strs[i].charAt(lcp)))//lcp should be less than length of strs[] and compare temp with other strings in array
               {
                isPrefixSame=false;//if the condition is true change boolean value to false
                break;//to stop loop
               }

                
                
            }
            if(isPrefixSame)//if isPrefixSame is true 
            {
                res.append(temp.charAt(lcp));//add the char to res 
                lcp++;//increment the lcp
                if(lcp >= temp.length())//lcp should be less than value of temp length
                {
                    break;//if lcp is greater than length of temp stop the program
                }
                
            }
        }
        return res.toString();//convert the result to string
        
    }
    }
    public static void main(String args[]){
        String[] strs = {"flower","flow","flight"};//array of strings
        LongestCommonPrefix obj = new LongestCommonPrefix();//create an object to call method
        String ans = obj.getCommonPrefix(strs);//call the method
        System.out.println(ans);//print the ans
    }
}