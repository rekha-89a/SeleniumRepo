package week1.day1;

public class Bike {
	
	public void driveBike()
	{
		System.out.println("start the bike");
	}
	public void applyBrake() 
	{
		System.out.println("Brake is applied");
	}
	public void soundHorn()
	{
		System.out.println("Press the horn");
	}
	public void isPuncture()
	{
		System.out.println("Puncture");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b= new Bike();
		b.driveBike();
		b.applyBrake();
		b.soundHorn();
		b.isPuncture();

	}

}
