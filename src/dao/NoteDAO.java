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
	void deleteNote(String tieziNo);
	
	/*
	 * ��ȡ
	 */
	Note loadNote(String no);
	
	/*
	 * �洢
	 */
	Note saveNote(String noteno,String notetitle,String ffloorct,String notewriter,String addr,String notetime);
	
	/*
	 * �������noteno
	 */
	String rtMaxNoteNo();
}
