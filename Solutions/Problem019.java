//target answer = 171
//loop count = 1200

import java.util.Calendar;

public class Problem019 {
   private static long loopCounter = 0;
   
   public static void main(String[] args) {
      int dayCount = 0;
      int targetDayOfWeek = Calendar.SUNDAY;
      int dayOfMonth = 1;
      int startYear = 1901;
      int endYear = 2000;
      Calendar c = Calendar.getInstance();
      
      c.set(startYear, 0, dayOfMonth);
      while(c.get(Calendar.YEAR) <= endYear) {
         if(c.get(Calendar.DAY_OF_WEEK) == targetDayOfWeek)
            dayCount++;
         c.add(Calendar.MONTH, 1);
         loopCounter++;
      }
      
      System.out.println("Number of 1st of the months on the selected day of the week: " + dayCount);
      System.out.println("Loop count: " + loopCounter);
   }
}

