import java.util.*;
class sam
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,m;
        do{
            m=(3*i*i-i)/2;
            i++;
        }while(m<n);
        if(m==n)
        System.out.println("Paragonal Number");
        else
        System.out.println("Not a Paragonal Number");
    }
}