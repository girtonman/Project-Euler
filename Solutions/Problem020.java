//target answer = 648
//loop count = 208

import java.math.BigInteger;

public class Problem020 {
   private static long loopCounter = 0;
   
   public static void main(String[] args) {
      
      BigInteger factorial = fastFactorial(100);
      char[] digits = factorial.toString().toCharArray();
      int sum = 0;
      for(int i = 0; i < digits.length; i++) {
         sum += Integer.parseInt("" + digits[i]);
         loopCounter++;
      }
      
      System.out.println("Digit sum: " + sum);
      System.out.println("Loop count: " + loopCounter);
   }
   
   //only works for even numbers
   public static BigInteger fastFactorial(int base) {
      int[] factors = new int[base/2];
      BigInteger result = new BigInteger("" + 1);
      int i = 0;
      while(base > 1) {
         if(i == 0)
            factors[i] = base;
         else
            factors[i] = base+factors[i-1];
         result = result.multiply(new BigInteger("" + factors[i]));
         base -= 2;
         i++;
         loopCounter++;
      }
      return result;
   }
}

