package pbl_app_Collections;
import java.util.*;


public class Maps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> h1=new HashMap<>();
		h1.put("India", "delhi");
		h1.put("Japan", "tokyo");
		h1.put("usa","washington dc");
		String key="India";
		String value="washington dc";
		System.out.println(h1.get(key));
		Set set=h1.entrySet();
		Iterator i=set.iterator();
		Object val=null;
		while(i.hasNext()) {
			Map.Entry<String,String> me=(Map.Entry)i.next();
			if(me.getValue().equals(value)) val=me.getValue();
		}
		System.out.println(val);
	}

}
