package model;
/**
 * 
 * @author CYwlDXS
 * 帖子详单model
 */
public class NoteDetails implements Comparable<NoteDetails>{
	
	/*
	 * 帖子编号
	 */
	private String noteno;
	
	/*
	 * 楼层
	 */
	private String floor;
	
	/*
	 * 内容
	 */
	private String context;
	
	/*
	 * 作者
	 */
	private String writer;
	
	/*
	 * 时间
	 */
	private String time;



	public String getNoteno() {
		return noteno;
	}



	public void setNoteno(String noteno) {
		this.noteno = noteno;
	}



	public String getFloor() {
		return floor;
	}



	public void setFloor(String floor) {
		this.floor = floor;
	}



	public String getContext() {
		return context;
	}



	public void setContext(String context) {
		this.context = context;
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



	public int compareTo(NoteDetails o) {
		if(this.time.compareTo(o.time) >0)
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
