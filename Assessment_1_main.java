import java.util.HashMap;

public class Assessment_1_main {

	public static void main(String[] args) {
		
		Assessment_1 country=new Assessment_1();
country.savecountrycapital("India", "Delhi");
country.savecountrycapital("UK", "London");

System.out.println(country.getcapital("India"));
System.out.println(country.getcountry("UK"));
System.out.println(country.arraylist());

HashMap<String, String> h2 = country.swapkeyvalue();
System.out.println(h2);

	}

}