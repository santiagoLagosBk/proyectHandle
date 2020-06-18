package beans;

public class User {

	private String password;
	private String userName;
	private String fisrtName;
	private String lastName;
	public User(String password, String userName, String fisrtName, String lastName) {
		super();
		this.password = password;
		this.userName = userName;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
	}
	public User() {
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
