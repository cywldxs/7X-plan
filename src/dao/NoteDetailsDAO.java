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
	void addNoteDetail(NoteDetails notedetails);
	
	/*
	 * 删除
	 */
	void deleteNoteDetail(int floor);
	
	/*
	 * 输出
	 */
	TreeSet<NoteDetails> listSortedNtDtils(String no);
	

}
