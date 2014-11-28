package dao;

import java.util.TreeSet;

import model.Note;

/**
 * 
 * @author CYwlDXS
 * ����
 * ��
 * ��
 * ���
 * ɾ��
 * �洢
 */
public interface NoteDAO {
	/*
	 * ���
	 */
	boolean addNote(Note note);
	
	/*
	 * ����
	 */
	void searchNote(String title);
	
	/*
	 * ���
	 */
	TreeSet<Note> listSortedNote();
	
	/*
	 * ɾ��
	 */
	boolean deleteNote(String noteno);
	
	/*
	 * ��ȡ
	 */
	Note loadNote(String no);
	
	/*
	 * �洢
	 */
	Note saveNote(String noteno,String type,String title,String fcontext,String hotnum,String writer,String time);
	
	/*
	 * �������noteno
	 */
	String rtMaxNoteNo();
	
	/*
	 * ���ص�ǰ����������һ
	 */
	String rtMaxHotnum(String noteno);
	/*
	 * ����
	 */
	boolean HotnumUp(String noteno,String num);
	
	
}
