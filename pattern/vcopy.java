import java.util.*;
class vcopy
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        Vector<Integer> list=new Vector<>();
        Vector<Integer> lis=new Vector<>();
        int val;
        while(true)
        {
            val = obj.nextInt();   
            if(val==-1)
            {
                break;
                
            }
            list.add(val);
        }
        System.out.println(list);
       lis = (Vector)(list.clone());
       System.out.println(lis+" ");
     }
}