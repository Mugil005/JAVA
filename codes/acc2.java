import java.util.*;
class acc2 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int size3=sc.nextInt();
        int[]arr1=new int[size1];
        int[]arr2=new int[size2];
        int[]arr3=new int[size3];
        int i,j,k;
        for(i=0;i<size1;i++)
          arr1[i]=sc.nextInt();
        for(j=0;j<size2;j++)
          arr2[j]=sc.nextInt();
        for(k=0;k<size3;k++)
          arr3[k]=sc.nextInt();    
        for(i=0;i<size1;i++)
        {
            int flag=0;
            for(j=0;j<size2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    for(k=0;k<size3;k++)
                    {
                        if(arr1[i]==arr3[k])
                        {
                            System.out.print(arr1[i]+" ");
                            flag=1;
                        }
                        if(flag==1)
                          break;
                    }
                }
                if(flag==1)
                  break;
            }
        }  
    }
}
