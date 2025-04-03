import static java.lang.Character.charCount;

public class Lab00 {
   public static void main(String[] args) {
      // declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      // printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);

      // a list
      int[] nums = {3, 6, -1, 2};

      for (int num : nums) {
         System.out.println(num);
      }

      // call a function
      int numFound = char_Count(y, 'l');
      System.out.println("Found: " + numFound);

      // a counting for loop
      for (int i = 1; i <= 10; i++) {
         System.out.print(i + " ");
      }
      System.out.println();
   }

   // new method
   public static int char_Count(String s, char c) {
      int count = 0;
      for (char ch : s.toCharArray()) {
         if (ch == c) {
            count++;
         }
      }
      return count;
   }
}