package week1.day1;

public class Student {
	String name = "Dharani";
	int rollNo = 5921;
	
	public void College() {
		String name = "QIS";
		System.out.println("college name: "+name);
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.College();
		System.out.println(obj.name);
		System.out.println(obj.rollNo);
	}

}
