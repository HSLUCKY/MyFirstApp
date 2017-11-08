package cn.wh.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import cn.wh.regexGroups.CheckGroup;

public class User {
	@NotNull(message="{usere.username.null}", groups=CheckGroup.class)
	@Max(message="{usere.username.max}", value=10, groups=CheckGroup.class)
	@NotEmpty(message="{usere.username.notempty}", groups=CheckGroup.class)
	@Length(max=11,min=2,message="{usere.username.length}", groups=CheckGroup.class)
	private String username;
	
	private String passwd;
	
	@Email(message="{usere.email.regex}", groups=CheckGroup.class)
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", passwd=" + passwd + ", email=" + email + "]";
	}
	
	
}
