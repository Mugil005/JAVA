import java.util.*;
class array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> lis = new ArrayList<>();
        while (true)
         {  
            int d = sc.nextInt();
            if(d!=-1)
            {
                String str = sc.next();
                list.add(str);
            }
            else{
                break;
            }
        }
        System.out.print(list);
//         System.out.println();
//         for(int i=list.size()-1;i>=0;i--)
//         {
//             System.out.print(list.get(i)+" ");
//         }
//         while (true)
//          {  
//             int e = sc.nextInt();
//             if(e!=-1)
//             {
//                 String st = sc.next();
//                 lis.add(st);
//             }
//             else{
//                 break;
//             }
//         }
//         System.out.println();
//         System.out.print(lis);
//         for(int i=0;i<lis.size()-1;i++)
//         {
//             for(int j=0;j<list.size()-1;j++)
//             {
//                 if(lis.get(j)==list.get(i))
//                 {
//                     System.out.println("true");
//                 }
//                 else{
//                     System.out.println("false");
//                 }
//             }
//         }
//         lis.addFirst("Orange");
//         System.out.print(lis);
}
}