public class WhileEx2
{
   public static void main(String[] args)
   {
      int x = 13;
      int y = 39;
      
      int gcd = 1;
      int i = 1;
      while (i<=y)
      {
         //test om i går op i både x og y
         if ((x%i==0) && (y%i==0))
         {
            //sæt gcd til nyt bedste bud på fælles divisor
            gcd = i;
            System.out.println("Divisor: " + i);
         }
         i++;
      }
      //udskriv største fælles divisor
      System.out.println("i efter while: " + i);
      System.out.println("Største fælles divisor: " + gcd);
      
      int testGcd = gcd(117, 78);
      System.out.println(117 + " " + 78 + " " + testGcd);
      System.out.println(512 + " " + 4096 + " " + gcd(512, 4096)); 
   }
   
   public static int gcd(int a, int b)
   {
      int budGcd = 1;
      int mindsteTal = Math.min(a, b);
      for (int i=1;i<=mindsteTal;i++)
      {
         if ((a%i==0)&&(b%i==0))
         {
            budGcd = i;
            System.out.println("Divisor: " + budGcd);
         }
      }
      System.out.println("Største divisor: " + budGcd);
      return budGcd;
   }
}