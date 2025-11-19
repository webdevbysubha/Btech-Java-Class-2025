abstract class RituparnaDiary
{
	int data;
	abstract void Stealing();
}
class Subha extends RituparnaDiary
{
	void Stealing()
	{
		System.out.println("Ami sob kichu pore felechi...Ebar ki hobe?? 😅");
	}
}
class RituAbstractionTest
{
	public static void main(String[] args) {
		Subha read = new Subha();
		read.Stealing();
	}
}