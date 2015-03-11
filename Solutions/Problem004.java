//target answer = 906609
public class Problem004 {
   public static void main(String[] args) {
      int largestPalindrome = 0;
      for(int number1 = 999; number1 >= 100; number1--) {
         for(int number2 = 100; number2 <= number1; number2++) {
            int product = number1 * number2;
            if(product > largestPalindrome && isPalindrome(product)) {
               largestPalindrome = product;
               System.out.println(largestPalindrome);
            }
         }
      }
   }
   
   private static boolean isPalindrome(int number) {
      int digits = 1;
      int divisor = 10;
      //find number of digits
      while (number / divisor >= 1) {
         digits++;
         divisor = divisor * 10;
      }
      
      //turn number into an array
      divisor = divisor / 10;
      int[] numberAsArray = new int[digits];
      for(int i = 0; i < digits; i++) {
         numberAsArray[i] = number / divisor;
         number -= numberAsArray[i] * divisor;
         divisor = divisor / 10;
      }
      
      //check for palindrome-ness
      for(int i = 0; i < (digits/2); i++) {
         if(numberAsArray[i] != numberAsArray[digits - 1 - i]) { return false; }
      }
      return true;
   }
}