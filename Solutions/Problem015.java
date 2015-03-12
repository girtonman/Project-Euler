//brute force
//target answer = 137846528820
//recursion count = a crap load
public class Problem015 {
   private static long recursionCounter = 0;
   private static int xDim = 20;
   private static int yDim = 20;
   private static long pathCount = 0;
   public static void main(String[] args) {
      go(0,0);
   
      System.out.println("Number of paths: " + pathCount);
      System.out.println("Recursion count: " + recursionCounter);
   }
   
   public static void go(int x, int y) {
      recursionCounter++;
      if(x == xDim && y == yDim)
         pathCount++;
      if(x < xDim)
         go(x+1, y);
      if(y < yDim)
         go(x, y+1);
   }
}