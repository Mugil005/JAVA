import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n;i<m;i++)
        {
            if(isperfectsq(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isperfectsq(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            if(num%(i*i)==0)
            {
                return true;
            }
        }
        return false;
    }
}