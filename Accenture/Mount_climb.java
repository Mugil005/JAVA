package Accenture;
import java.util.*;
class Mount_climb {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int high=0;
    int count=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='u'){
            high++;
            if(high==0)
              count++;
        }else{
            high--;
        }
    }
    System.out.print(count);
 }
}
