class Registration
{
    int fees = 999;
}
class Student extends Registration
{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Payment : "+s.fees);
    }
}