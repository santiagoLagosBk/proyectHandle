package javaguide.login.principal;

public class LoginU {

    private String user;
    private String password;

    public LoginU(String user, String password) {
        this.user = user;
        this.password = password;
    }
    public LoginU(){

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ""+user;
    }
}
