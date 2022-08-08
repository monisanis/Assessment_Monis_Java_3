

import java.sql.Connection;
import java.util.Scanner;

import com.Assessment_2_Main;
import com.Assessment_2_Student;
import com.Assessment_2_Validate;

public class Assessment_2_Signup {
	public static void signup() {
		Scanner sc= new Scanner(System.in);
		Assessment_2_Validate vali=new Assessment_2_Validate();
		Assessment_2_Main db=new Assessment_2_Main();
		 try{
			  Connection con=db.getConnection();
			  System.out.println("Enter Roll No : ");
			  int rollno=sc.nextInt();
			  int k=rollno;

			  sc.nextLine();
			  System.out.println("Enter Name : ");
			  String studentname=sc.nextLine();
			  System.out.println("Enter Class : ");
			  String standard=sc.nextLine();
			  System.out.println("Enter Dob");
			  String dob=sc.nextLine();
			  System.out.println("Enter fees");
			  double fees=sc.nextDouble();
			  Assessment_2_Student s=new Assessment_2_Student(rollno,studentname.toUpperCase(),standard.toUpperCase(),dob,fees);
			  System.out.println(db.insert(s));
		  }catch(Exception e) {
				 
		  }
		  
		 
	}
}
