// Java program to calculate S.I using cmd line argument
public class Interest {
    public static void main(String[] args) {
        double p , r;
        int t;

        p = Double.parseDouble(args[0]);
        r = Double.parseDouble(args[1]);
        t = Integer.parseInt(args[2]);

        double si = (p*r*t)/100;

        System.out.println("S.I = "+si);
    }
}
