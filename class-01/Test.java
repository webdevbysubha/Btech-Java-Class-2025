public class Test {
    int a; // Member Variable
    int b; // Member Variable
    void getdata(int x, int y)
    {
        a = x;
        b = y;
    }
    void display()
    {
        System.out.println("1st Value is : "+a+" 2nd Value is : "+b);
    }

}
class Program2{
    public static void main(String[] args) {

        Test n1; //n1 => Object Name
        n1 = new Test(); //new => memory allocation operator

        Test n2 = new Test(); // Object Creation

        n1.getdata(10,20);

        n2.getdata(50,100);

        n1.display(); 
        n2.display();

    }

}
