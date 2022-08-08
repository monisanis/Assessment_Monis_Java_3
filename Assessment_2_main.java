

import java.util.Scanner;

import com.Assessment_2_Delete;
import com.Assessment_2_Display;
import com.Assessment_2_Modification;
import com.Assessment_2_Signup;


public class Assessment_2_App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("ABC International School");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.)Registration 2.)Deletion 3.)Modify 4.)Display");
        System.out.println( "Enter your choice");
        int n=sc.nextInt();
        switch(n) {
        case 1: Assessment_2_Signup.signup();
        break;
        case 2:try {
				Assessment_2_Delete.delete();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
        break;
        case 3: Assessment_2_Modification.modify();
        break;
        case 4:Assessment_2_Display.display();
        break;
        }
        
    }
}

