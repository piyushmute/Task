package otherFile.com;

public class RegiPojo {

	private int rid;
	private String name;
	private String email;
	private String pwd;
	private String gender;
	private String country;
	private Long phno;
	private String rdate;
	
	public RegiPojo() {
		super();
	}

	public RegiPojo(String name, String email, String pwd, String gender, String country, Long phno, String rdate) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.country = country;
		this.phno = phno;
		this.rdate = rdate;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

}
