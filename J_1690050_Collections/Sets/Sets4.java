package pbl_app_Collections;

import java.util.HashSet;
import java.util.*;

class TreeSetDemo{
	TreeSet<String> H1=new TreeSet<String>();
	public TreeSet<String> saveCountryNames(String countryName) {
		H1.add(countryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> i=H1.iterator();
		while(i.hasNext()) {
			if(i.next()==CountryName) {
				return CountryName;
			}
		}
		return null;
	}
}

public class Sets4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		TreeSetDemo sd=new TreeSetDemo();
		sd.saveCountryNames("india");
		sd.saveCountryNames("Japan");
		sd.saveCountryNames("Netherlands");
		sd.saveCountryNames("Egypt");
		System.out.println(sd.getCountry("Egypt"));
	}

}
