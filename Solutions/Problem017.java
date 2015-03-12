//target answer = 21124
//loop count = 1000
public class Problem017 {
   private static long loopCounter = 0;
   private static String[] numbers = {"",
         "one",
         "two",
         "three",
         "four",
         "five",
         "six",
         "seven",
         "eight",
         "nine",
         "ten",
         "eleven",
         "twelve",
         "thirteen",
         "fourteen",
         "fifteen",
         "sixteen",
         "seventeen",
         "eighteen",
         "nineteen"};
   private static String[] tens = {"","",
         "twenty",
         "thirty",
         "forty",
         "fifty",
         "sixty",
         "seventy",
         "eighty",
         "ninety"};

   public static void main(String[] args) {
      int limit = 1000;
      int totalChars = 0;
      String space = ""; //set this to a space if we want readable numbers, nothing if we want an answer
      String dash = ""; // set this to a dash if we want readable numbers, nothing if we want an answer
      for(int i = 1; i <= limit; i++) {
         String numberWord = "";
         int workingNumber = i;
         boolean tensUsed = false;
         boolean hundredsUsed = false;
         if(workingNumber >= 1000000000){ //billion
            int factor = workingNumber/1000000000;
            numberWord += numbers[factor] + space;
            if(factor > 0){
               numberWord += "billion" + space;
            }
            workingNumber -= factor * 1000000000;
         }
         if(workingNumber >= 1000000){ //million
            int factor = workingNumber/1000000;
            numberWord += numbers[factor] + space;
            if(factor > 0){
               numberWord += "million" + space;
            }
            workingNumber -= factor * 1000000;
         }
         if(workingNumber >= 1000){ //thousand
            int factor = workingNumber/1000;
            numberWord += numbers[factor] + space;
            if(factor > 0){
               numberWord += "thousand" + space;
            }
            workingNumber -= factor * 1000;
         }
         if(workingNumber >= 100){ //hundred
            int factor = workingNumber/100;
            numberWord += numbers[factor] + space;
            if(factor > 0){
               numberWord += "hundred" + space;
            }
            workingNumber -= factor * 100;
            if(workingNumber > 0)
               numberWord += "and" + space;
         }
         if(workingNumber >= 20) {
            int factor = workingNumber/10;
            numberWord += tens[factor];
            workingNumber -= factor * 10;
            tensUsed = true;
         }
         if(workingNumber > 0){
            if(tensUsed)
               numberWord += dash;
            numberWord += numbers[workingNumber];
         }
         System.out.println(numberWord);
         totalChars += numberWord.toCharArray().length;
         loopCounter++;
      }
      
      System.out.println("Total chars: " + totalChars);
      System.out.println("Loop count: " + loopCounter);
   }
}