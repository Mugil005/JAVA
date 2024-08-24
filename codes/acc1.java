import java.util.*;
class acc1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int[]arr=new int[10];
        while (num1!=0) {
            arr[num1%10]+=1;
            arr[num2%10]+=1;
            arr[num3%10]+=1;
            num1/=10;
            num2/=10;
            num3/=10;
        }
        for(int i=0;i<10;i++){
            if(arr[i]==3)
               System.out.println(i);
        }
    } 
    
}
