package dao;

import java.util.TreeSet;


import model.NoteDetails;

/**
 * 
 * @author CYwlDXS
 * �����굥
 * ��
 * ɾ
 * ���
 */
public interface NoteDetailsDAO {
	
	/*
	 * ���
	 */
	void addNoteDetail(NoteDetails notedetails);
	
	/*
	 * ɾ��
	 */
	void deleteNoteDetail(int floor);
	
	/*
	 * ���
	 */
	TreeSet<NoteDetails> listSortedNtDtils(String no);
	

}
