package model;
/**
 * 
 * @author CYwlDXS
 * 普通用户model
 *
 */
public class NormalUser {
	

	/*
	 * 登录帐号
	 */
	private String no;
	/*
	 * 姓名
	 */
	private String name;
	/*
	 * 性别
	 */
	private String sex;
	/*
	 * 生日
	 */
	private String birthday;
	/*
	 * 密码
	 */
	private String pwd;
	/*
	 * email
	 */
	private String mail;

	/*
	 * 联系方式
	 */
	private String tele;

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	
}
