final class Super
{
	final double pi = 3.14;
	final void calculateResult(){
		System.out.println("Override me and place your logic");
	}
}
class Sub extends Super
{
    // void calculateResult(){
     	// pi = 3.14159;
     	//System.out.println("pi = " +pi);
    // }
}
class FinalTest
{
	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.calculateResult();
	}
}