//target answer = 104743
public class Problem007 {
   public static void main(String[] args) {
      int targetPrime = 10001;
      int currentPrime = 0;
      int prime = 0;
      int number = 2;
      int divisor = 2;
      
      while (currentPrime != targetPrime) {
         //reach half way point, skip to next
         if(divisor > (number / 2)) {
            currentPrime++;
            prime = number;
            System.out.println("Prime #" + currentPrime + ": " + prime);
            number++;
            divisor = 2;
         }
         else {
            //if it is compound, skip it
            if(number%divisor == 0) {
               number++;
               divisor = 2;
            }
            //else increment divisor
            else {
               divisor++;
            }
         }
         
      }
   }
}