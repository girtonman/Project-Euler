//target answer = 233168
public class Problem001 {
   public static void main(String[] args) {
      int sum = 0;
      for(int i = 3; i < 1000; i++) {
         sum = (i%3 == 0 || i%5 == 0) ? sum + i: sum;
      }
      System.out.println(sum);
   }
}