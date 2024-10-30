//Enter 3 numbers from the user & make a function to print their average.

package practice;
import java.util.Scanner;

public class Practice1 {

  public static int calcAverage(int x , int y , int z) {
    int sum = x + y + z;
    int avg = sum/3;
    System.out.println("Average:" + avg);
    return avg;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    calcAverage(a, b, c);

  }
  
}
