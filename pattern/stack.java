import java.util.Stack;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
class stack
{
    public static void main(String[] args) {
        {
            Stack<Integer> list = new Stack<Integer>();
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                int val  = sc.nextInt();
                if(val ==-1)
                break;

                switch (val) 
                {
                    case 1:
                       int m = sc.nextInt();
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
}