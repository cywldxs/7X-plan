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
	private String tieziNo;
	
	/*
	 * ¥��
	 */
	private String tieziFloor;
	
	/*
	 * ����
	 */
	private String tieziContexts;
	
	/*
	 * ����
	 */
	private String tieziWriter;
	
	/*
	 * ʱ��
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
