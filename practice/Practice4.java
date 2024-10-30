//Write a function that takes in the radius as input and returns the circumference of a circle.

package practice;
import java.util.Scanner;

public class Practice4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    double pi = 3.14;
    double circum = 2*r*pi;

    System.out.println(circum);
  }
  
}
