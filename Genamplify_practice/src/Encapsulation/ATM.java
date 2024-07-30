package Encapsulation;

public class ATM {
	
	private int pin ;
	private int otp ;
	private String name; 
	
	public void setpin(int outpin) {
		pin = outpin;
	}
	public int getpin() {
		return pin;
	}
	
	
	public void setotp(int outotp) {
		otp=outotp;
	}
	public int getotp() {
		return otp;
	}
	
	public void setname(String outname) {
		name = outname;
	}
	public String getname() {
		return name;
	}
	
	
	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.setpin(4543);
		obj.setotp(627272);
		obj.setname("Rajesh");
		
		System.out.println("The ATM pin is : "+obj.getpin());
		System.out.println("The OTP is : "+obj.getotp());
		System.out.println("The ATM Holder Name Is : "+obj.getname());
	}
	

}
