public class Problem003 {
   public static void main(String[] args) {
      long base = 600851475143l;
      long i = 2;
      while (i <= base) {
         if(base%i == 0) {
            base = base / i;
            i--;
         }
         i++;
      }
      System.out.println(i);
   }
}