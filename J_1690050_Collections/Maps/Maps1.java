package pbl_app_Collections;
import java.util.*;
class MapsDemo{
	HashMap<String,String> M1=new HashMap<>();
	Set<Map.Entry<String,String>> set=M1.entrySet();
	
	
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Iterator<Map.Entry<String, String>> i=set.iterator();
		while(i.hasNext()) {
			Map.Entry<String, String> me=(Map.Entry<String, String>)i.next();
			if(me.getValue().equals(capitalName)) {
				return me.getKey();
			}
		}
		return null;
	}
	
	public HashMap<String,String> capitalAsKeys(){
		Iterator<Map.Entry<String, String>> i=set.iterator();
		HashMap<String,String> M2=new HashMap<>();
		while(i.hasNext()) {
			Map.Entry<String, String> me=(Map.Entry<String, String>)i.next();
			M2.put(me.getValue(), me.getKey());
		}
		return M2;
	}
	
	
	public ArrayList<String> getCountryNames(){
		Iterator<Map.Entry<String, String>> i=set.iterator();
		ArrayList<String> li=new ArrayList<>();
 		while(i.hasNext()) {
			Map.Entry<String, String> me=(Map.Entry<String, String>)i.next();
			li.add(me.getKey());
		}
 		return li;
	}
}
public class Maps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapsDemo md=new MapsDemo();
		md.saveCountryCapital("India","Delhi");
		md.saveCountryCapital("Japan","tokyo");
		System.out.println(md.M1);
		System.out.println(md.getCapital("India"));
		System.out.println(md.getCountry("tokyo"));
		System.out.println(md.capitalAsKeys());
		System.out.println(md.getCountryNames());
	}

}
