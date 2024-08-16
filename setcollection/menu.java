import java.util.*;
class menu {
            public static void main(String[] args) 
            {
                HashMap<String,Integer> map = new HashMap<>();
                Scanner sc = new Scanner(System.in);
                while(true)
                {  
                    String str = sc.next();
                    int n = sc.nextInt();
                    if(n==-1)
                    break;
                    map.put(str,n);
                }
                System.out.print(map);
            }

}