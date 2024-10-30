//Write a function which takes in 2 numbers and returns the greater of those two.

package practice;
import java.util.Scanner;

public class Practice3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if ( a>b ) {
      System.out.println(a + " is greater");
    } else {
      System.out.println(b + " is greater");
    }
  }
  
}
