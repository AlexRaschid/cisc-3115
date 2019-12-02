
public class ExtendedPhoneNumber extends PhoneNumber{
	String phoneDesc;
	public ExtendedPhoneNumber(String phoneDesc, String phoneNum) {
		super(phoneNum);
		this.phoneDesc = phoneDesc;
		
		// TODO Auto-generated constructor stub
	}
	
	public ExtendedPhoneNumber read(String d, String n) {
		return new ExtendedPhoneNumber(d,n);	
	}

}
