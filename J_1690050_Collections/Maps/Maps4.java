package pbl_app_Collections;
import java.math.*;
import java.util.*;
public class Maps4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> ContactList =new HashMap<>();
		ContactList.put("hari",898981243 );
		System.out.println(isKeyExists(ContactList,"hari"));
		System.out.println(isValueExists(ContactList,898956565));
	}
	public static boolean isKeyExists(Map m,String key) {
		return m.get(key)!=null ? true :false ;
	}
	public static boolean isValueExists(Map map,int value) {
		Set s=map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String,Integer> m=(Map.Entry<String, Integer>)i.next();
			if(m.getValue()==value) {
				return true;
			}
		}
		return false;
	}
}
