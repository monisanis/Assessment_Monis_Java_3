import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assessment_1{
	private HashMap<String,String>h1;
	
	public Assessment_1() {
		h1=new HashMap<String,String>();
	}
	public HashMap<String,String>savecountrycapital(String countryname,String capital)
	{
		h1.put(countryname, capital);
		return h1;
	}
	public String getcapital(String countryname) {
		return h1.get(countryname);
	}
	public String getcountry(String capitalname) {
		Set<Entry<String,String>> set=h1.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> s=it.next();
			if(s.getValue().contentEquals(capitalname))
				return s.getKey();
		}
		return null;
	}
	public HashMap<String,String>swapkeyvalue(){
		HashMap<String,String>h2=new HashMap<String,String>();
		Set<Entry<String,String>>set=h1.entrySet();
		Iterator<Entry<String,String>>it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String>s=it.next();
			h2.put(s.getValue(),s.getKey());
		}
		return h2;
	}
	public ArrayList<String> arraylist(){
		ArrayList<String>list=new ArrayList<String>();
		Set<Entry<String,String>>set=h1.entrySet();
		Iterator<Entry<String,String>>it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String>m=it.next();
		}
		return list;
	}
}