import java.util.*;
import java.lang.*;
class BinarySystem {
    public static int OperationsBinaryString(char[] str)
    {
        int len=str.length;
        int ans= str[0]-'0';
        for(int i=1;i<len-1;i+=2)
        {    
            int j=i+1;
            if(str[i]=='A')
            {
                ans = ans & (str[j]-'0');
            } else if(str[i]=='B')
            {
                ans = ans | (str[j]-'0');
            }
            else if(str[i]=='C')
            {
                ans = ans ^ (str[j]-'0');
            }
        }
    return ans;
 }
public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] str=s.toCharArray();
        System.out.printf("%d",OperationsBinaryString(str));
    }
}