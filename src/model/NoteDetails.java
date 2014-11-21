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
	private String tieziNo;
	
	/*
	 * 楼层
	 */
	private String tieziFloor;
	
	/*
	 * 内容
	 */
	private String tieziContexts;
	
	/*
	 * 作者
	 */
	private String tieziWriter;
	
	/*
	 * 时间
	 */
	private String tieziTime;

	public String getTieziNo() {
		return tieziNo;
	}

	public void setTieziNo(String tieziNo) {
		this.tieziNo = tieziNo;
	}

	public String getTieziFloor() {
		return tieziFloor;
	}

	public void setTieziFloor(String string) {
		this.tieziFloor = string;
	}

	public String getTieziContexts() {
		return tieziContexts;
	}

	public void setTieziContexts(String tieziContexts) {
		this.tieziContexts = tieziContexts;
	}

	public String getTieziWriter() {
		return tieziWriter;
	}

	public void setTieziWriter(String tieziWriter) {
		this.tieziWriter = tieziWriter;
	}

	public String getTieziTime() {
		return tieziTime;
	}

	public void setTieziTime(String tieziTime) {
		this.tieziTime = tieziTime;
	}

	public int compareTo(NoteDetails o) {
		if(this.tieziTime.compareTo(o.tieziTime) >0)
		{
			return 1;
		}
		else if(this.tieziTime.compareTo(o.tieziTime) <0)
		{
			return 0;
		}
		else
			return -1;
	}
}
