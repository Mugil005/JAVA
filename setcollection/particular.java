import java.util.HashMap;
import java.util.Scanner;
class particular
{
    public static void main(String[] args)
    {
      HashMap<String,Integer> list = new HashMap<>();
      Scanner sc = new Scanner(System.in);
      int s;
      String str;
      while(true)
      {
        str = sc.next();
        s = sc.nextInt();
        if(s==-1)
            break;
            list.put(str,s);
            list.get(s);
            
      }
      System.out.println(list);
      System.out.println(list.get(s));
    }
}