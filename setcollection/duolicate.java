import java.util.*;
class duolicate
{
    public static void main(String[] args)
    {
        HashSet<Integer> list  = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) 
        { 
            int num = sc.nextInt();
            if(num==-1)
            {
                break;
            }
                list.add(num);
        }
        System.out.println(list);
    }
}