package mbPojo;

public class Role {
	private Integer id;
	private String rolecode;
	private String rolename;



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRolecode() {
		return rolecode;
	}


	public void setRolecode(String rolecode) {
		this.rolecode = rolecode;
	}


	public String getRolename() {
		return rolename;
	}


	public void setRolename(String rolename) {
		this.rolename = rolename;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", rolecode=" + rolecode + ", rolename=" + rolename + "]";
	}
	
	
}
