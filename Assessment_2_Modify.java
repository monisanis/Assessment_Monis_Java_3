ackage com.service;

import java.util.Scanner;

import com.Assessment_2_Main;
import com.Assessment_2_Student;

public class Assessment_2_Modification {

	public static void modify() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll number");
		int roll=sc.nextInt();
		Assessment_2_Student st=new Assessment_2_Student();
		st.setRoll(roll);
		Assessment_2_Main db=new Assessment_2_Main();
		db.modi(st.getRoll());
		
		
	}
	
}
