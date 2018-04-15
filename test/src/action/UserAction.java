package action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport{
	private String username;
	private String password;
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
	public String execute(){
		return "success";	
	}
	@Override
	public void validate(){
		if(username==null||username.trim().equals("")){
			String a[]={getText("uname")};
			this.addFieldError("username",getText("login.null",a));
		}
		if(password==null||password.trim().equals("")){
			String a[]={getText("upass")};
			this.addFieldError("password",getText("login.null",a));
		}
	}
}

