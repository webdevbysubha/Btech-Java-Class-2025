public class DefaultParameterized {
   int a;
   int b;
   DefaultParameterized() // Default Constructor
   {

   }   
   DefaultParameterized(int x, int y) // Parameterized Constructor
   {
       a = x;
       b = y;
   }
   void Display()
   {
      System.out.println(a+" "+b);
   }
}
class TestCons{
   public static void main(String[] args) {
      DefaultParameterized td = new DefaultParameterized(); 
      DefaultParameterized tp = new DefaultParameterized(10,20);
      td.Display();
      tp.Display();
   }
}
