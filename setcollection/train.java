import java.util.*;
class traintimingchart
 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    HashMap<String, String> train = new HashMap<>();
    for (int i = 0; i < size; i++) {
      String name = sc.next();
      String time = sc.next();
      train.put(name, time);
    }
    System.out.println("Train timing : " + train);

    sc.close();
}
}