package DSA;

// import java.util.Arrays;

public class LinearSearch {
  public static void main(String[] args) {
    int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
    // int target = 19;
    int target = 199;
    int ans = linearSearch(nums, target);
    System.out.println(ans);
    
  }
  static int linearSearch(int[] arr, int target) {
    if(arr.length == 0 ){
      return -1;
    }
    for(int i = 0; i< arr.length; i++){
      int element = arr[i];
      if (element == target) {
        return i;
      }
    }
    //returns -1 if does not exist or any above code is not executed.  
    return -1;
  }
}

//----Questions----
// Q1-Search In strings
// public class  SearchInstrings {
//   public static void main(String[] args) {
//     String name = "Krish";
//     char target = 'u';
//     System.out.println(search(name, target));
//     System.out.println(search2(name, target));

//   }
//   static boolean search(String str, char target) {
//     if(str.length() == 0) {
//       return false;
//     }

//     for (int i = 0; i<str.length();i++) {
//       if(target == str.charAt(i)) {
//         return true; 
//       }
//     }
//     return false;
//   }

//   //using for-each loop
//   static boolean search2(String str, char target) {
//     if(str.length() == 0) {
//       return false;
//     }

//     for (char ch : str.toCharArray()) {
//       if(ch == target) {
//         return true; 
//       }
//     }
//     return false;
//   }

// }


//Q-2 Search In Range
// public class LinearSearchInrange {
//   public static void main(String[] args) {
//     int[] nums = {18,12,-7,3,14,28};
//     int target = 14;
//     System.out.println(Search(nums, target, 1, 4));
    
//   }

//   static int Search(int[] arr, int target, int start ,int end) {
//     if(arr.length == 0 ){
//       return -1;
//     }

//     for(int i = start; i <= end; i++){
//       int element = arr[i];
//       if (element == target) {
//         return i;
//       }
//     }
//     return -1;
//   }
// }

//Q-2 Find minimum no.
// public class FindMin {
//   public static void main(String[] args) {
//     int[] nums = {18,12,7,3,14,28};
//     System.out.println(min(nums));
//   }
//   static int min(int[] arr) {
//     if(arr.length == 0 ){
//       return -1;
//     }

//     int ans = arr[0];
//     for(int i = 0 ; i<arr.length;i++) {
//       if (arr[i] < ans ) {
//         ans = arr[i];
//       }
//     }
//     return ans;
//   }
// }

//Q-3 Search in 2D Array
// public class SearchIn2dArray {
//   public static void main(String[] args) {
//     int[][] arr = {
//       {23,4,1},
//       {18,12,3,9},
//       {78,99,34,56},
//       {18,12}
//     };
//     int target = 9;
//     int[] ans = search(arr,target);
//     System.out.println(Arrays.toString(ans));
//   }
//   static int[] search(int[][] arr, int target){
//     if(arr.length == 0){
//       return new int[]{-1,-1} ;
//     }

//     for(int i = 0; i<arr.length; i++){
//       for(int j = 0; j<arr[i].length;j++) {
//         if(arr[i][j] == target) {
//           return new int[]{i,j};
//         }

//       }
//     }
//   return new int[]{-1,-1};
//   }
// }

//Q-4 Find max no. in 2D Array
// public class SearchIn2dArray {
//   public static void main(String[] args) {
//     int[][] arr = {
//       {23,4,1},
//       {18,12,3,9},
//       {78,99,34,56},
//       {18,12}
//     };
//     int ans = max(arr);
//     System.out.println(ans);
//   }
//   static int max(int[][] arr){
//     if(arr.length == 0){
//       return -1 ;
//     }

//     int max = Integer.MIN_VALUE;
//     for(int i = 0; i<arr.length; i++){
//       for(int j = 0; j<arr[i].length;j++) {
//         if(arr[i][j] > max) {
//           max = arr[i][j];
//         }
//       }
//     }
//   return max;
//   }
// }


//Q-5 Find numbers with even no. of digits.
// public class EvenDigit {
//   public static void main(String[] args) {
//     int[] num = {12,345,2,6,7896};
//     System.out.println(findeven(num));

//   }
//   static int findeven(int[] nums) {
//     int count = 0;
//     for(int num : nums) {
//       if(even(num)) {
//         count++;
//       }
//     }
//     return count;
//   }
//   static boolean even(int num) {
//     int numberOfDigits = digits(num);
//     if(numberOfDigits % 2 == 0){
//       return true;
//     }
//     return false;
//     // return numberOfDigits % 2 == 0;
//   }

//   static int digits(int num) {
//     int count = 0;
//     while (num > 0) {
//       count++;
//       num = num / 10;
//     }
//     return count;


//   }
// }


//Q-6 you are given m x n  integer grid accounts where accounts[i][j] is the amount of money the ith customer has the jth bank. return the wealth that the richest customer has.a customer's wealth is the amount of money they have in all their bank accounts. the richest customer that has the maximum wealth.
// public class maxW {
//   public static void main(String[] args) {
//     int[][] accounts = {
//       {1,2,3},
//       {3,2,1}
//     };
//     System.out.println(maxWealth(accounts));
//   }
//   static int maxWealth(int[][] accounts){
//     //person = row
//     //account = col
//     int ans = Integer.MIN_VALUE;
//     for (int person = 0; person < accounts.length; person++){
//       int sum = 0;
//       for(int account = 0; account < accounts[person].length; account++){
//         sum += accounts[person][account];
//       }
//       if (sum > ans) {
//         ans = sum;
//       }
//     }
//     return ans;
//   }  
// }