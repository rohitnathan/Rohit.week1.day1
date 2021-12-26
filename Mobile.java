package week1.day1;

public class Mobile {
	
	public void makecall() {
		System.out.println("make a call");
		
	}

	public void sendMSG() {
		System.out.println("Send message");
	}
	
	public static void main (String[] args) {
		Mobile objMobile = new Mobile();
		
		objMobile.makecall();
		objMobile.sendMSG();
		
	}
}

