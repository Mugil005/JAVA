import java.util.*;
class stem
{
    public static void main(String[] args) {
        Stack<Integer> list=new Stack<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int n=sc.nextInt();
            if(n==-1)break;
            switch(n)
            {
                case 1:
                    int m=sc.nextInt();
                    System.out.print(list.push(m));
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println(list.pop());
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println(list.peek());
                    System.out.println(list);
                    break;
                case 4:
                    System.out.println(list.isEmpty());
                    break;        
            }
        }
        System.out.println(list);
    }
}