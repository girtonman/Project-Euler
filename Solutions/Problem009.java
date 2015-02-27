//brute force
//loop count = 199374425
public class Problem009 {
   public static void main(String[] args) {
      long loopCounter = 0;
      int targetSum = 1000;
      int a = 0;
      int b = 0;
      int c = 0;
      for (int i = 1; i <= targetSum; i++) {
         for (int j = 1; j <= targetSum; j++) {
            for (int k = 1; k <= targetSum; k++) {
               loopCounter++;
               if(Math.pow(i,2) + Math.pow(j,2) == Math.pow(k,2) && i + j + k == targetSum) {
                  System.out.println("Three numbers: " + i + ", " + j + ", " + k);
                  System.out.println((i * j * k));
                  System.out.println("Loop count: " + loopCounter);
                  return;
               }
               if(loopCounter % 10000000 == 0) {
                  System.out.println("" + loopCounter + " combinations checked");
                  System.out.println("Last check: " + i + ", " + j + ", " + k);
               }
            }
         }
      }
   }
}