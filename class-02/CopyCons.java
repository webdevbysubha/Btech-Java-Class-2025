public class CopyCons {
    int id;
    String name;
    CopyCons(int i, String nm)
    {
        id = i;
        name = nm;
    }
    CopyCons(CopyCons c) // copy constructor
    {
        id  = c.id;
        name = c.name;
    }
    void Display()
    {
        System.out.println(id+" "+name);
    }
   public static void main(String[] args) {
    CopyCons c1 = new CopyCons(100,"Rituparna");
    CopyCons c2 = new CopyCons(c1);
    c1.Display();
    c2.Display();
   }
}
