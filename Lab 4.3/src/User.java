import java.util.*;

class User {
	private String username = new String();
	private String password = new String();
	private String hint = new String();
	
	public User(String u, String p, String h){
		this.username = u;
		this.password = p;
		this.hint = h;
	}
	public User(){
		this.username = "";
		this.password = "";
		this.hint = "";
	}
	
	public String getUsername(){
		return this.username;
	}
	public String getHint(){
		return this.hint;
	}
	public boolean verifyPassword(String p){
		return (this.password.equals(p));
	}
	public String toString(){return "User " + this.username;}
	public static User read(Scanner s){
			return new User(s.next(),s.next(),s.next());	
	}
	
	
	
}