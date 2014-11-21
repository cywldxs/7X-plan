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
 */
public interface NoteDAO {
	/*
	 * 添加
	 */
	void addNote(Note note);
	
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
}
