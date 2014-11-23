package dao;

import java.util.TreeSet;

import model.Note;

/**
 * 
 * @author CYwlDXS
 * 帖子
 * 增
 * 查
 * 输出
 * 删除
 * 存储
 */
public interface NoteDAO {
	/*
	 * 添加
	 */
	boolean addNote(Note note);
	
	/*
	 * 查找
	 */
	void searchNote(String title);
	
	/*
	 * 输出
	 */
	TreeSet<Note> listSortedNote();
	
	/*
	 * 删除
	 */
	void deleteNote(String tieziNo);
	
	/*
	 * 读取
	 */
	Note loadNote(String no);
	
	/*
	 * 存储
	 */
	Note saveNote(String noteno,String notetitle,String ffloorct,String notewriter,String addr,String notetime);
	
	/*
	 * 返回最大noteno
	 */
	String rtMaxNoteNo();
}
