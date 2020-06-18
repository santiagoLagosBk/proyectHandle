package beans;



public class employ {
	
	private String userName;
	private String password;
	public employ(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public employ() {
		
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
