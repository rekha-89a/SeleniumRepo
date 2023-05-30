package week3.day2.assignments;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public void getStudentInfo(String email,int ph)
	{
		System.out.println(email);
		System.out.println(ph);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(123);
		s.getStudentInfo(123, "Rekha");
		s.getStudentInfo("xyz@gmail.com", 123);
	}
}
