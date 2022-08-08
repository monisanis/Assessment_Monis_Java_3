package com.abc.service;

import java.util.Scanner;

import com.abc.DAO.Assessment_2_Main;
import com.abc.model.Assessment_2_Student;

public class Assessment_2_Display {
		public static void display() throws Exception {
			Scanner sc=new Scanner(System.in);
			Assessment_2_Student st=new Assessment_2_Student();
			System.out.println("Enter Your Roll Number");
			int roll=sc.nextInt();
			st.setRoll(roll);
			Assessment_2_Main db=new Assessment_2_Main();
			try {
				db.disp(st.getRoll());
			} catch (Exception e) {
			
			}
		}
}
