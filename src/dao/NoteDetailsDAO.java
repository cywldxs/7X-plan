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
	boolean deleteNoteDetail(String noteno,String floor);
	
	/*
	 * ���
	 */
	TreeSet<NoteDetails> listSortedNtDtils(String no);
	
	/*
	 * �洢
	 */
	NoteDetails saveNoteDetails(String noteno,String floor,String context,String writer,String time);
	
	/*
	 * ����¥�����ֵ+1
	 */
	String  rtMaxFloor(String noteno);

}
