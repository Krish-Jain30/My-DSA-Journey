//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

package practice;
import java.util.Scanner;

public class Practice7 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("Press 1 to start & 0 to stop");
        int input = sc.nextInt();

        while (input == 1) {
          System.out.print("Enter the number:");
          int number = sc.nextInt();
          if(number>0){
            positive++;
          } else if( number<0 ) {
            negative++;
          }else {
            zero++;
          }
          System.out.println("Press 1 to continue1 & 0 to stop");
          input = sc.nextInt();
        }

        System.out.println("Positives:" + positive);
        System.out.println("Negatives:" + negative);
        System.out.println("Zeroes:" + zero);
  }
  
}
