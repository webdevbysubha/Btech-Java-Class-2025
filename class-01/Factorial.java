// Anonymous Object
public class Factorial {
    void fact(int n)
    {
        int f = 1;
       for (int i = 1; i <= n; i++) {
        f = f * i;
       }
        System.out.println("Factorial = "+f);
    }
    public static void main(String[] args) {
        // Factorial ob = new Factorial();
        // ob.fact(5);

        new Factorial().fact(5); // Anonymous Object
    }
}
