package vo;
/**
 * 
 * @author CYwlDXS
 * һ���û���Ϣ
 */
public class NormalUserVO extends model.NormalUser{

	/*
	 * ����
	 */
	private String Name;
	/*
	 * �Ա�
	 */
	private String sex;
	/*
	 * ����
	 */
	private String age;
	/*
	 * ����
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
