import java.util.*;
class aja
{
    public static void main(String[] args)
    {
        Vector<Integer> list=new Vector<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int val = sc.nextInt();
            if(val==-1)
            break;
            list.add(val);
        }
        System.out.println(list);
        list.add(4, 6);
        System.out.println(list);
    }
}