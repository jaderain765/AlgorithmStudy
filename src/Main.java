import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      while(true) {
         int n1 = scan.nextInt();
         
         if(n1 == 0) break;
         
         String str = scan.next();
         int n2 = scan.nextInt();
         
         long num = allTo(str, n1);
//         System.out.println("10진 변환 : "+ num);
         System.out.println(toAll(num, n2));
      }
      
      scan.close();
   }
   
   public static long allTo(String str, int radix) {
      long ret = 0;
      
      for(int i2 = 0, i = str.length() - 1; i >= 0; i--, i2++) {
         ret += inputChar(str.charAt(i)) * (long)Math.pow(radix, i2);
      }
      
      return ret;
   }
   
   public static String toAll(long num, int radix) {
      StringBuilder ret = new StringBuilder();
      
      if(num == 0) return "0";
      
      while(num > 0) {
         ret.insert(0, outputNum((int)(num%radix)));
         num /= radix;
      }
      
      return ret.toString();
   }
   
   public static char outputNum(int num) {
      if(num < 10) return (char) ('0'+num);
      
      num -= 10;
      return (char)('A'+num);
   }
   
   public static int inputChar(char ch) {
      if(Character.isDigit(ch)) 
         return (ch - '0');
      
      return (ch - 'A') + 10;
   }
}