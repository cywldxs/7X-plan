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
	boolean deleteNote(String noteno);
	
	/*
	 * 读取
	 */
	Note loadNote(String no);
	
	/*
	 * 存储
	 */
	Note saveNote(String noteno,String type,String title,String fcontext,String hotnum,String writer,String time);
	
	/*
	 * 返回最大noteno
	 */
	String rtMaxNoteNo();
	
	/*
	 * 返回当前最大点赞数
	 */
	String rtMaxHotnum(String noteno);
	/*
	 * 点赞
	 */
	boolean HotnumUp(String noteno,String num,String userno);
	/*
	 * 更新主帖最后回复时间
	 */
	boolean updateNoteTime(String noteno,String time);
	
	
}
