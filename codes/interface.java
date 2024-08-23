import java.util.*;
//@FunctionlInterface
interface rectangle{
    int print(int s1,int s2);
}
interface retcir{
    int display(int s1,int s2);
}
interface square{
    int print1(int s);
}
interface sqrcir{
    int display1(int s);
}
interface triangle{
    double print2(int s1,int s2);
}
interface tricir{
    int display2(int s1,int s2,int s);
}
interface circle{
    double print3(int s);
}
interface cicir{
    double display3(int s);
}
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rectangle obj=(int s1,int s2)->{
            return(s1*s2);
        };
        retcir obj1=(int s1,int s2)->{
            return(2*(s1+s2));
        };
        square obj2=(int s)->{
            return(s*s);
        };
        sqrcir obj3=(int s)->{
            return(4*s);
        };
        triangle obj4=(int s1,int s2)->{
            return((0.5)*(s1*s2));
        };
        tricir obj5=(int s1,int s2,int s)->{
            return(s1+s2+s);
        };
        circle obj6=(int s)->{
            return(3.14*s*s);
        };
        cicir obj7=(int s)->{
            return(2*3.14*s);
        };
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s=sc.nextInt();
        System.out.println("area of rectangle "+obj.print(s1,s2));
        System.out.println("circumfrance of rectangle "+obj1.display(s1,s2));
        System.out.println("area of square "+obj2.print1(s));
        System.out.println("circumfrance of square "+obj3.display1(s));
        System.out.println("area of triangle "+obj4.print2(s1,s2));
        System.out.println("circumfrance of triangle "+obj5.display2(s1,s2,s));
        System.out.println("area of circle "+obj6.print3(s));
        System.out.println("circunfrance of circle "+obj7.display3(s));
    }
}