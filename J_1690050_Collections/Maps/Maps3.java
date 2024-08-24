package pbl_app_Collections;
import java.util.*;
class Properties{
	static HashMap<String,String> h=new HashMap<String,String>();
	
	public void putStateCap(String state,String capital) {
		h.put(state,capital);
	}
	public  String getCap(String state) {
		return h.get(state);
	}
	
}
public class Maps3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.putStateCap("Andhra Pradesh", "Amaravati");
		p.putStateCap("Telangana", "Hyderabad");
		p.putStateCap("Madhya Pradesh", "bhopal");
		p.putStateCap("Maharashtra", "Mumbai");
		Set s=p.h.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String,String> m=(Map.Entry<String, String>)i.next();
			System.out.println("State: "+m.getKey()+"\tCapital: "+m.getValue());
		}
	}

}
