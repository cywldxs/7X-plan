package vo;
/**
 * 
 * @author CYwlDXS
 * 一般用户信息
 */
public class NormalUserVO extends model.NormalUser{

	/*
	 * 姓名
	 */
	private String Name;
	/*
	 * 性别
	 */
	private String sex;
	/*
	 * 年龄
	 */
	private String age;
	/*
	 * 生日
	 */
	private String birthday;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
}
