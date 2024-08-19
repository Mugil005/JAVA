import java.util.*;
class mugu
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> lis=new ArrayList<>();
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
        
       lis = (ArrayList)(list.clone());
       System.out.println(lis+" ");
     }
}

