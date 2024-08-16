import java.util.Scanner;
class PascalTriangleGenerator implements Runnable
{
 int rows;
 public static final Object lock = new Object();
 public PascalTriangleGenerator(int rows)
 {
  this.rows = rows;
 }
 public void run()
 {
  for (int i = 0; i < rows; i++) 
  {
   synchronizedMethod(i);
   delayExecution(2000);
  }
 }
 public static synchronized void synchronizedMethod(int row)
 {
  synchronized (lock) 
  {
    int number = 1;
    System.out.print("Row " + (row + 1) + ": ");
    for (int j = 0; j <= row; j++)
    {
      System.out.print(number + " ");
      number = number * (row - j) / (j + 1);
    }
    System.out.println();
  }
 }
 private void delayExecution(int milliseconds)
 {
  try
  {
    Thread.sleep(milliseconds);
  }
  catch (InterruptedException e)
  {
            e.printStackTrace();
  }
 }
 public static void main(String[] args)
 {
  Scanner ob = new Scanner(System.in);
  System.out.print("Enter the number of rows for Pascal's Triangle: ");
  int numRows = ob.nextInt();
  PascalTriangleGenerator generator = new PascalTriangleGenerator(numRows);
  Thread t1 = new Thread(generator);
  t1.start();
  try
  {
   t1.join();
  } 
  catch (InterruptedException e)
  {
   e.printStackTrace();
}
}
ob.close();
}