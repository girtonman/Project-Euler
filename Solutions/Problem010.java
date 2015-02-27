//sieve of eratosthenes
//target answer = 142913828922
//new loop count = 5957731
//old loop count = 71501893702
public class Problem010 {
   private static long loopCounter = 0;
   private static int primeCount = 0;
   private static int numbersChecked = 0;
   private static long sum = 0;
   
   public static void main(String[] args) {
      int primeLimit = 2000000;
      boolean[] sieve = new boolean[primeLimit];
      int i = 2;
      while (i < primeLimit) {
         loopCounter++;
         if(!sieve[i]) {
            sum += i;
            markMultiples(i, sieve);
            i = nextUnmarked(i, sieve);
         }
      }
      System.out.println("Sum of primes < " + primeLimit + " :" + sum);
      System.out.println("Loop count: " + loopCounter);
   }
   
   private static void markMultiples(int base, boolean[] sieve) {
      for (int i = base; i < sieve.length; i += base) {
         loopCounter++;
         if(loopCounter % 50000000 == 0) {
            System.out.println("" + numbersChecked + " numbers checked. Loop count: " + loopCounter + " Prime count: " + primeCount+ " Sum: " + sum);
         }
         if(!sieve[i]) {
            sieve[i] = true;
            numbersChecked++;
         }
      }
   }
   
   private static int nextUnmarked(int index, boolean[] sieve) {
      while (index < sieve.length && sieve[index]) {
         index++;
      }
      return index;
   }
}