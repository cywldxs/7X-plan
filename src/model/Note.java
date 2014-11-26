package model;



/**
 * 
 * @author CYwlDXS
 * 帖子model
 */
public class Note implements Comparable<Note>{
	/*
	 * 帖子编号
	 */
	private String noteno;
	/*
	 * 群组名
	 */
	private String type;
	/*
	 * 帖子标题
	 */
	private String title;
	
	/*
	 * 1楼内容
	 */
	private String fcontext;
	/*
	 * 点赞数
	 */
	private String hotnum;
	/*
	 * 作者帐号
	 */
	private String writer;
	/*
	 * 发帖日期
	 */
	private String time;


	

	
	public String getNoteno() {
		return noteno;
	}

	public void setNoteno(String noteno) {
		this.noteno = noteno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFcontext() {
		return fcontext;
	}

	public void setFcontext(String fcontext) {
		this.fcontext = fcontext;
	}

	public String getHotnum() {
		return hotnum;
	}

	public void setHotnum(String hotnum) {
		this.hotnum = hotnum;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	/**
	 * 规则列出
	 */
	/*
	public void formattedOut() {
		System.out.printf("%10s   %10s   %10s  \n",
				this.title, this.writer, this.time);
	}*/

	public int compareTo(Note o) {
		if(this.time.compareTo(o.time) <0)
		{
			return 1;
		}
		else if(this.time.compareTo(o.time) ==0)
		{
			return 0;
		}
		else
			return -1;
	}


}
