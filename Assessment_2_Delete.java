package com.abc.service;

import java.util.Scanner;

import com.abc.DAO.Assessment_2_Main;
import com.abc.model.Assessment_2_Student;

public class Assessment_2_Delete {
		
	public static void delete() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no to delete :");
		int roll=sc.nextInt();
		Assessment_2_Student st=new Assessment_2_Student();
		st.setRoll(roll);
		Assessment_2_Main db=new Assessment_2_Main();
		db.dele(st.getRoll());
		
	}
	
}