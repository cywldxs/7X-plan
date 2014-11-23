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
	boolean addNoteDetail(NoteDetails notedetails);
	
	/*
	 * ɾ��
	 */
	void deleteNoteDetail(int floor);
	
	/*
	 * ���
	 */
	TreeSet<NoteDetails> listSortedNtDtils(String no);
	
	/*
	 * �洢
	 */
	NoteDetails saveNoteDetails(String noteno,String floor,String notecontext,String notewriter,String notetime);
	
	/*
	 * ����¥�����ֵ+1
	 */
	String  rtMaxFloor(String noteno);

}
