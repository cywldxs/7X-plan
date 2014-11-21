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
 */
public interface NoteDAO {
	/*
	 * ���
	 */
	void addNote(Note note);
	
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
}
