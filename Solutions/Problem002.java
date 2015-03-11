//target answer = 4613732
public class Problem002 {
   public static void main(String[] args) {
      int sum = 0;
      int temp = 0;
      int last = 0;
      int current = 1;
      while(current < 4000000) {
         if(current%2 == 0) {
            sum += current;
         }
         temp = current;
         current += last;
         last = temp;
      }
      System.out.println(sum);
   }
}