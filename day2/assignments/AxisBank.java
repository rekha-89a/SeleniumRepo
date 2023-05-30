package week3.day2.assignments;

public class AxisBank extends BankInfo
{
public void deposit()
{
	System.out.println("deposit of 2000");
}
public static void main(String[] args) {
	AxisBank ab = new AxisBank();
	BankInfo b= new BankInfo();
	
	ab.deposit();
	ab.savings();
	b.deposit();
	ab.fixed();
	
}
}
