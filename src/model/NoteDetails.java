package model;
/**
 * 
 * @author CYwlDXS
 * �����굥model
 */
public class NoteDetails implements Comparable<NoteDetails>{
	
	/*
	 * ���ӱ��
	 */
	private String noteno;
	
	/*
	 * ¥��
	 */
	private String floor;
	
	/*
	 * ����
	 */
	private String context;
	
	/*
	 * ����
	 */
	private String writer;
	
	/*
	 * ʱ��
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
