package vo;
/**
 * 
 * @author CYwlDXS
 * 一般用户信息
 */
public class NormalUserVO extends model.NormalUser{

	/*
	 * 学籍号
	 */
	private String id;
	
	/*
	 * 图象链接
	 */
	private String image;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
