package chatapplication;

public class Reg {
	public Reg(String username, String password, long mobileno, int userid, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.userid = userid;
		this.email = email;
	}
	public Reg() {
		// TODO Auto-generated constructor stub
	}
	private String username;
	private String password;
	private long mobileno;
	private int userid;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}