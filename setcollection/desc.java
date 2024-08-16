import java.util.*;
class desc {
            public static void main(String[] args) 
            {
                TreeSet<Integer> desc = new TreeSet<>();
                Scanner sc = new Scanner(System.in);
                while(true)
                {  
                    int n = sc.nextInt();
                    if(n==-1)
                    break;
                    desc.add(n);
                }
                System.out.print(desc);
                System.out.println();
                Iterator ele;
                 ele = desc.descendingIterator();
                while(ele.hasNext())
                 {
                     System.out.print(ele.next()+" ");
                 }
                 System.out.println(desc);
            }
}