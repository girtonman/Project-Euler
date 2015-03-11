//target answer = 25164150
public class Problem006 {
   public static void main(String[] args) {
      int max = 100;
      int sumSquare = 0;
      int squareSum = 0;
      
      for (int i = 1; i <= max; i++) {
         sumSquare += Math.pow(i, 2);
         squareSum += i;
         System.out.println("1-" + i + ": " + (int)Math.pow(squareSum, 2) + " - " + sumSquare + " = " + ((int)Math.pow(squareSum, 2) - sumSquare));
      }
   }
}