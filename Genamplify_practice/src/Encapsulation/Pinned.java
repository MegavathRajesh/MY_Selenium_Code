package Encapsulation;

public class Pinned {
	private int pin ;
	private int otp ;
	private String name ;
	
	public void setpin(int outpin) {
		
		pin = outpin;
	}
	public int getpin() {
		
		return pin ;
	}
	
	public void setotp(int outotp) {
		otp=outotp;
		
	}
	public int getotp() {
		
		return otp;
	}
	
	public void setname(String outname) {
		name=outname;
		
	}
	public String getname() {
		return name;
	}
	public static void main(String[] args) {
		
		Pinned p = new Pinned();
		p.setpin(2233);
		p.setotp(345252);
		p.setname("Rajesh");
		
		System.out.println(p.getpin());
		System.out.println(p.getotp());
		System.out.println(p.getname());
	}

}
