import java.util.*;
class sample
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
     int num = sc.nextInt();
     
     if(num==0)
     {
       System.out.print("Time Estimated: 0 minutes");
     }
     else if(num>=0 && num<=2000)
     {
       System.out.print("Time Estimated: 25 minutes");
     }
     else if(num>=2001 && num<=4000)
     {
       System.out.print("Time Estimated: 35 minutes");
     }
     else if(num>=4001  && num <=7000)
     {
       System.out.print("Time Estimated: 45 minutes");
     }
     else
     {
       System.out.print("INVALID INPUT");
     }
  }
}