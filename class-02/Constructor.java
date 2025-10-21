public class Constructor {
    int x;
    Constructor()
    {
       x = 10;
    }
    public static void main(String[] args) {
        Constructor myobj = new Constructor();
        System.out.println(myobj.x);
    }
    
}
