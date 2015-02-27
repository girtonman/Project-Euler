//brute force
//loop count = 71501893702
public class Problem010 {
   private static long loopCounter = 0;
   private static int primeCount = 0;
   private static long sum = 0;
   
   public static void main(String[] args) {
      int primeLimit = 2000000;
      for (int i = 2; i < primeLimit; i++) {
         loopCounter++;
         if(loopCounter % 10000000 == 0) {
            System.out.println("" + i + " numbers checked. Loop count: " + loopCounter + " Prime count: " + primeCount + " Sum: " + sum);
         }
         if(isPrime(i)) {
            primeCount++;
            sum += i;
         }
      }
      System.out.println("Sum of primes < " + primeLimit + " :" + sum);
      System.out.println("Loop count: " + loopCounter);
   }
   
   private static boolean isPrime(int number) {
      for (int i = 2; i <= (number/2); i++) {
         loopCounter++;
         if(loopCounter % 50000000 == 0) {
            System.out.println("" + (number - 1) + " numbers checked. Loop count: " + loopCounter + " Prime count: " + primeCount+ " Sum: " + sum);
         }
         if (number % i == 0) {
            return false;
         }
      }
      return true;
   }
}