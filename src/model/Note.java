package model;



/**
 * 
 * @author CYwlDXS
 * ����model
 */
public class Note implements Comparable<Note>{
	/*
	 * ���ӱ��
	 */
	private String tieziNo;
	
	/*
	 * ���ӱ���
	 */
	private String tieziTitle;
	
	/*
	 * 1¥����
	 */
	private String tieziFirstContext;
	
	/*
	 * �����ʺ�
	 */
	private String tieziWriter;
	
	/*
	 * ����
	 */
	private String tieziAddr;
	
	/*
	 * ��������
	 */
	private String tieziTime;

	public String getTieziNo() {
		return tieziNo;
	}

	public void setTieziNo(String tieziNo) {
		this.tieziNo = tieziNo;
	}

	public String getTieziTitle() {
		return tieziTitle;
	}

	public void setTieziTitle(String tieziTitle) {
		this.tieziTitle = tieziTitle;
	}

	public String getTieziFirstContext() {
		return tieziFirstContext;
	}

	public void setTieziFirstContext(String tieziFirstContext) {
		this.tieziFirstContext = tieziFirstContext;
	}

	public String getTieziWriter() {
		return tieziWriter;
	}

	public void setTieziWriter(String tieziWriter) {
		this.tieziWriter = tieziWriter;
	}

	public String getTieziAddr() {
		return tieziAddr;
	}

	public void setTieziAddr(String tieziAddr) {
		this.tieziAddr = tieziAddr;
	}

	public String getTieziTime() {
		return tieziTime;
	}

	public void setTieziTime(String tieziTime) {
		this.tieziTime = tieziTime;
	}
	

	
	/**
	 * �����г�
	 */
	public void formattedOut() {
		System.out.printf("%10s   %10s   %10s  \n",
				this.tieziTitle, this.tieziWriter, this.tieziTime);
	}

	public int compareTo(Note note) {
		if(this.tieziTime.compareTo(note.tieziTime) >0)
		{
			return 1;
		}
		else if(this.tieziTime.compareTo(note.tieziTime) <0)
		{
			return 0;
		}
		else
			return -1;
	}
}
