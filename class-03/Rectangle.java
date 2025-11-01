public class Rectangle {
    int length;
    int breadth;
    Rectangle(int l , int b)
    {
        length = l;
        breadth = b;
    }
    int area()
    {
        return length * breadth;
    }
}
class Cuboid extends Rectangle
{
    int height;
    Cuboid(int x,int y, int z)
    {
        super(x,y);
        height = z;
    }
    int volume()
    {
        return length * breadth * height;
    }
}
class Inheritance
{
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,20,30);
        int a = c.area();
        int v = c.volume();
        System.out.println("Area : "+a);
        System.out.println("Volume : "+v);
    }
}
