package week2.day1;

public class Mobile {
	
	public void makeCall() {
		
		String mobileModel = "Apple";
		float mobileWeight=121.1f;		
		System.out.println(mobileModel+ " \n" +mobileWeight);		
	}
 public void sendMsg() {
	 boolean isFullCharged=true;
	 int mobileCost= 1000;
	 	 System.out.println(isFullCharged+ " \n" +mobileCost);
	
}
 
public static void main(String[] args) {
	Mobile iphone=new Mobile();
	System.out.println("This is my mobile");
	iphone.makeCall();
	iphone.sendMsg();
	

} 
}
