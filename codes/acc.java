import java.util.*;
class acc
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int[]res=new int[size];
        int j,multi=1;
        for(j=0;j<size;j++)
        {
            multi=1;
            for(int itr=0;itr<size;itr++)
            {
                if(j!=itr)
                multi*=arr[itr];
            }
            res[j]=multi;
        }
        for(int ele:res)
           System.out.print(ele+" ");
    }
}