//target answer = 1366
//loop count = 302

import java.math.BigInteger;

public class Problem016 {
   private static long loopCounter = 0;
   public static void main(String[] args) {
      int power = 1000;
      int base = 2;
      BigInteger result = new BigInteger("" + base).pow(power);
      char[] digits = result.toString().toCharArray();
      int sum = 0;
      for(int i = 0; i < digits.length; i++) {
         sum += Integer.parseInt("" + digits[i]);
         loopCounter++;
      }
      
      System.out.println("Result: " + result);
      System.out.println("Digit sum: " + sum);
      System.out.println("Loop count: " + loopCounter);
   }
}