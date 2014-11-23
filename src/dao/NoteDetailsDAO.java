package dao;

import java.util.TreeSet;


import model.NoteDetails;

/**
 * 
 * @author CYwlDXS
 * 帖子详单
 * 增
 * 删
 * 输出
 */
public interface NoteDetailsDAO {
	
	/*
	 * 添加
	 */
	boolean addNoteDetail(NoteDetails notedetails);
	
	/*
	 * 删除
	 */
	void deleteNoteDetail(int floor);
	
	/*
	 * 输出
	 */
	TreeSet<NoteDetails> listSortedNtDtils(String no);
	
	/*
	 * 存储
	 */
	NoteDetails saveNoteDetails(String noteno,String floor,String notecontext,String notewriter,String notetime);
	
	/*
	 * 返回楼层最大值+1
	 */
	String  rtMaxFloor(String noteno);

}
