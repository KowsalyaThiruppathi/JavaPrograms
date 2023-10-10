import java.util.*;
class ExcelNumberToTitle {
    public String convertToTitle(int columnNumber)
    {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int rem = (columnNumber - 1) % 26;
            char ch = (char) (rem + 'A');
            sb.insert(0, ch);
            columnNumber = (columnNumber - 1) / 26;
        }

        return sb.toString();
    
        
    }
    public static void main(String args[])
    {
        ExcelNumberToTitle obj = new ExcelNumberToTitle();
        Scanner sc = new Scanner(System.in);
        int columnNumber;
        columnNumber = sc.nextInt();
        String ans = obj.convertToTitle(columnNumber);
        System.out.println(ans);
    }
}