//rev 1
// using math to make it easier
// technically I could do (2*n)!/(n!)^2. as long as the grid is cubed, 
// but I want something more dynamic
//target answer = 137846528820
//loop count = 
public class Problem015 {
   private static long loopCounter = 0;
   private static int xDim = 20;
   private static int yDim = 20;
   public static void main(String[] args) {
      long pathCount = 0;
      long[][] grid = new long[xDim][yDim];
      
      for(int i = 0; i < yDim; i++) {
         for(int j = 0; j < xDim; j++) {
            if(j == 0 && i == 0)
               grid[j][i] = 1 + 1;
            else if(j == 0)
               grid[j][i] = 1 + grid[j][i-1];
            else if(i == 0)
               grid[j][i] = 1 + grid[j-1][i];
            else
               grid[j][i] = grid[j-1][i] + grid[j][i-1];
            loopCounter++;
         }
      }
      
      for(int i = 0; i < yDim; i++) {
         for(int j = 0; j < xDim; j++) {
            System.out.print("              ".substring(0,14 - ("" + grid[j][i]).toString().length()) + grid[j][i]);
         }
         System.out.println();
      }
      
      System.out.println("Number of paths: " + grid[xDim-1][yDim-1]);
      System.out.println("Loop count: " + loopCounter);
   }
}