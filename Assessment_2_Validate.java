

public class Assessment_2_Validate {
	
  public Assessment_2_Validate() {
		super();
		
	}

public int ROllValid(int roll)
  {
	  int c=0;
	  while(roll!=0)
	  {
		  c=c+1;
		  roll=roll/10;
	  }
	  return c;
  }
}
