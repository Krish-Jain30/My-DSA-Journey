/**
 * FifteenthClass
 */


//----- INTERMEDIATE RECURSION -----


// public class FifteenthClass {
  //Tower of Hanoi
  // public static void towerOfHanoi(int n,String src,String helper,String dest) {
  //   if(n==1){
  //     System.out.println("Transfedr disk"+n+"from"+src+"to"+dest);
  //     return;
  //   }
  //   towerOfHanoi(n-1, src, dest, helper);
  //   System.out.println("Transfedr disk"+n+"from"+src+"to"+dest);
  //   towerOfHanoi(n-1, helper, src, dest);
    
  // }
  // public static void main(String[] args) {
  //   int n=3;
  //   towerOfHanoi(n, "S", "H", "D"); 
  // }

  //Print a string in reverse
  // public static void printRev(String str,int idx) {
  //   if(idx==0){
  //     System.out.print(str.charAt(idx));
  //     return;
  //   }
  //   System.out.print(str.charAt(idx));
  //   printRev(str, idx-1);
  // }
  // public static void main(String[] args) {
  //   String str = "abcd";
  //   printRev(str, str.length()-1); 
  // }

  //Find the 1st occurence and last of an element in string
  // public static int first = -1;
  // public static int last = -1;

  // public static void findOccurance(String str,int idx ,char element) {
  //   if (idx == str.length()) {
  //     System.out.println(first);
  //     System.out.println(last);
  //   }
  //   char currChar = str.charAt(idx);
  //   if(currChar==element){
  //     if (first==-1) {
  //       first = idx;
  //     } else {
  //       last = idx;
  //     }
  //   }
  //   findOccurance(str, idx+1, element);
    
  // }
  // public static void main(String[] args) {
  //   String str = "abaacdaefaah";
  //   findOccurance(str, 0, 'a');
  // }


  //Check if an array is sorted (strictly increasing)
  // public static boolean isSorted(int arr[],int idx) {
  //   if(idx == arr.length-1){
  //     return true;
  //   }

  //   if(arr[idx] < arr[idx+1]){
  //     //array is sorted
  //     return isSorted(arr, idx+1);
  //   } else {
  //     return false;
  //   }
  // }
  
  // public static void main(String[] args) {
  //   int arr[] = {1,2,3};
  //   System.out.println(isSorted(arr, 0));
  // }

  //Move all x to end of string
//   public static void moveAll(String str, int idx, int count, String newString) {
//     if(idx == str.length()){
//       for(int i=0;i<count;i++){
//         newString += "x";
//       }
//       System.out.println(newString);
//       return;
//     }

//     char currChar = str.charAt(idx);
//     if (currChar == 'x') {
//       count ++;
//       moveAll(str, idx+1, count, newString);
//     } else {
//       newString += currChar;
//       moveAll(str, idx+1, count, newString);
//     }
//   }
//   public static void main(String[] args) {
//     String str = "axbcxxd";
//     moveAll(str, 0, 0, "");
//   }
// }
