package Accenture;
import java.util.*;
class vowel_permulation {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char c=0;
    int count=0;
    int sum=0;
    for(int i=0;i<s.length();i++){
    c=s.charAt(i);
    if(c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'){
        count++;
    }
}
    for(int i=1;i<=count;i++){
        sum=i*i-count;
    }
    System.out.print(sum);
  }
}