public class WhileLoops{

   public static void main(String[] args){
   /*
      //tæl fra 1 - 10
      int i = 1;
      while (i <= 10){
         System.out.println(i);
         i++;
      }
      System.out.println("Slut while");
      */
      /*
      //for-løkke, der gør det samme som while-løkken
      for (int j=1;j<=10;j++){
         System.out.println(j);
      }
      System.out.println("Slut for");
      */
      /*
      int a = 13;
      int d = a/2;
      int m = a % 2;
      System.out.print(a + "div 2 " + d + "modulus " + m);
      */
      /* 
      //primtal? Mindste divisor
      //tal der skal undersøges
      int p = 143;
      //divisor
      int n = 2;
      //hvis modulus 2 er 0, så er det en divisor
      while (p % n != 0){
         n++;
      }
      System.out.println("Mindste divisor: " + n);
      //er mindste divisor tallet selv, så er det et primtal
      if (n == p){
         System.out.println("Det er et primtal");
      }
      */
      
      //Den lille tabel
      int tabel,j;
      
      tabel=1; //tabel 1 - 10
      while (tabel<=10){
         //indre loop giver tallet, tabellen skal ganges med 1 - 10
         j=1;
         while (j<=10){
            System.out.print(tabel*j + "\t");
            j++;
         }
         System.out.print("\n"); //kunne også være System.out.println();
         tabel++;
      }
      
      //random tal
      int r=1;
      double randomTal;
      double sum=0;
      while (r<=6){
         randomTal=Math.random();
         System.out.println("Math.random()= "+randomTal);
         //tæl summen sammen
         
         //læg en til r
         r++;
      }
      //find og udskriv gennemsnit af tallene
      
      
   }
   
}