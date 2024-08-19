import java.util.ArrayList;
import java.util.Vector;
import java.util.*;
class ere
{
    public static void main(String[] args)
    {
        Vector<Integer> list=new Vector<>();
        Scanner sc = new Scanner(System.in);
        int cout =0;
        while(true)
        {
            int val = sc.nextInt();
            if(val==-1)
            break;
            cout++;
            list.add(val);
        }
        System.out.println(list);
        System.out.println(cout);
    }
}