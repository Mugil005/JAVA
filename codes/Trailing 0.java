import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countTrailingZeros(n));
    }
    public static int countTrailingZeros(int n)
    {
        int count=0;

        for(int i=5;n/i>=1;i*=5)
        {
            count+=n/i;
        }
        return count;
    } 
}
