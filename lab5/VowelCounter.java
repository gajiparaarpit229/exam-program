import java.util.Scanner;
public class VowelCounter {
   public VowelCounter() {
   }
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int a = 0;
      int e = 0;
      int i = 0;
      int o = 0;
      int u = 0;
      while(true) {
         System.out.println("Enter a sentence (or 'quit' to exit): ");
         String srt = sc.nextLine();
         if (srt.equalsIgnoreCase("quit")) {
            System.out.println("Total count of 'a': " + a);
            System.out.println("Total count of 'e': " + e);
            System.out.println("Total count of 'i': " + i);
            System.out.println("Total count of 'o': " + o);
            System.out.println("Total count of 'u': " + u);
            sc.close();
            return;
         }
         for(int j=0;j<srt.length();j++){
            if(srt.charAt(j)=='a') a++;
            if(srt.charAt(j)=='e') e++;
            if(srt.charAt(j)=='i') i++;
            if(srt.charAt(j)=='o') o++;
            if(srt.charAt(j)=='u') u++;
         }
      }
   }
}