package week1.day1;

public class Mobile {
	String msg="Hi";
	long contactNumber=2345678901L;
	
	public void sendMsg() {
		System.out.println("Message: "+msg);
		
	}
	
	public void makeCall() {
		System.out.println("Calling: "+contactNumber);
		
	}
	
	public void saveContact() {
		System.out.println("AD: " +contactNumber);
		
	}
	public static void main(String[] args) {
		
		Mobile objectName= new Mobile();
		objectName.makeCall();
		objectName.sendMsg();
		objectName.saveContact();
	}

}


