package DSA;

import java.util.Arrays;

// public class CyclicSort {
//   public static void main(String[] args) {
//     int[] arr = {3,5,2,1,4};
//     cyclicsort(arr);
//     System.out.println(Arrays.toString(arr));
//   }

//   static void cyclicsort(int[] arr) {
//     int i = 0;
//     while(i < arr.length) {
//       int correctIndex = arr[i] -1;
//       if(arr[i] != arr[correctIndex]) {
//         //swap
//         int temp = arr[i];
//         arr[i] = arr[correctIndex];
//         arr[correctIndex] = temp ;
//       } else {
//         //moving forward
//         i++;
//       }
//     }
//   }
// }


//----QUESTIONS----
//q1-Given an array nums containing n distinct numbers in the range [0,n] , return the only number in the range that is missing from the array.
// public class CyclicSort {
//   public static void main(String[] args) {
//     int[] nums = {3,0,1};
//     System.out.println(missingNo(nums));
//   }
//   public static int missingNo(int[] arr) {
//     int i = 0;
//     while( i < arr.length) {
//       int correct = arr[i];
//       if(arr[i] < arr.length && arr[i] != arr[correct]) {
//         //swap
//         int temp = arr[i];
//         arr[i] = arr[correct];
//         arr[correct] = temp; 
//       } else {
//         //move forward
//         i++;
//       }
//     }
//     //search for first missing no.
//     for (int index = 0; index < arr.length; index++) {
//       if(arr[index] != index) {
//         return index;
//       }
//     }
//     //case-2
//     return arr.length;
//   }
// }


//q2-Given an array nums of n integers where nums[i] is in the range [1,n] return an array of all the integers in the range [1,n] that do not appear in nums
// public class CyclicSort {
//   public static void main(String[] args) {
//     int[] nums = {4,3,2,7,8,2,3,1};
//     System.out.println(findDisappearNumbers(nums));
//   }
//   static ArrayList<Integer> findDisappearNumbers(int[] arr) {
//     int i = 0;
//     while( i < arr.length) {
//       int correct = arr[i]-1;
//       if(arr[i] != arr[correct]) {
//         //swap
//         int temp = arr[i];
//         arr[i] = arr[correct];
//         arr[correct] = temp; 
//       } else {
//         //move forward
//         i++;
//       }
//     }
//     //just find missing numbers
//     ArrayList<Integer> ans = new ArrayList<>();
//     for(int j = 0; j< nums.length; j++) {
//       if(nums[j] != j+1) {
//          ans.add(j+1);
//       }
//     }
//     return ans;
//   }
// }

