public class ThisKeyword {
    int a;
    int b;
   ThisKeyword() // Default Constructor
   {

   }   
   ThisKeyword(int a, int b) // Parameterized Constructor
   {
       this.a = a;
       this.b = b;
   }
   void Display()
   {
      System.out.println(a+" "+b);
   }
}
class Main{
   public static void main(String[] args) {
      ThisKeyword td = new ThisKeyword(); 
      ThisKeyword tp = new ThisKeyword(10,20);
      td.Display();
      tp.Display();
   }
}
