import java.util.*;
class sam
{
    public static void main(String[]args)
    {
        Vector<Integer> list=new Vector<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==-1)break;
            list.add(n);
        }
        System.out.println(list);
        list.add(4,6);
        System.out.println(list);
    }
}