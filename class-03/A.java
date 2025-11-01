public class A {
    int a;
    A(int a)
    {
        this.a = a;
    }
    void show()
    {
        System.out.println(a);
    }
}
class B extends A
{
    int b;
    B(int a, int b)
    {   
        super(a);
        this.b = b;
    }
    void show() // Method Overriding
    {
        System.out.println("First value : "+a+" "+"Second Value : "+b);
    }
}
class Overriding
{
    public static void main(String[] args) {
        B ob = new B(10,20);
        ob.show();
    }
}
