public class Problem005 {
   public static void main(String[] args) {
      int number = 1;
      int target = 20;
      int current = 1;
      int factor = 1;
      //evenly divisible by all numbers 1-20
      boolean evenlyDivisible = false;
      while (!evenlyDivisible) {
         evenlyDivisible = true;
         for (int i = 1; i <= current; i++) {
            if ((number*factor)%i != 0) { evenlyDivisible = false; }
         }
         factor++;
         if (evenlyDivisible) {
            System.out.println("1 - " + current + ": " + number);
            if(current != target) {
               current++;
               number = number*(factor - 1);
               factor = 1;
               evenlyDivisible = false;
            }
         }
      }
   }
}