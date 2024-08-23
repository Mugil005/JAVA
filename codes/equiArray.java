import java.util.*;
class equiArray {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int[] count1=check(a[i]);
            for(int j=0;j<n;j++)
            {
                int[] count2=check(b[j]);
                if(comp(count1,count2)==1)
                {
                    System.out.printf("(%d,%d)",i,j);
                    count2[j]=-1;
                    break;
                }
            }
            
        }
    }
    public static int[] check(int a)
    {
        int[] count=new int[10];
        while(a>0)
        {
            count[a%10]++;
            a=a/10;
        }
        return count;
    }

    public static int comp(int[] a, int[] b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                return 0;
            }
        }
        return 1;
    }
}
