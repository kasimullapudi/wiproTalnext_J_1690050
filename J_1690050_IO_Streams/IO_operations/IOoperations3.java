package pbl_app_IO;
import java.util.*;
import java.io.*;
public class IOoperations3 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String file="source.txt";
		File f=new File("D:/kasi/"+file);
		FileInputStream in=new FileInputStream(f);
		Map<String,Integer> hm=new HashMap<String,Integer>();
		String s="";
		int size=in.available();
		while(size--!=0) {
			s+=(char)in.read();
		}
		String[] words=s.split("\\s+");
		int j=0;
		for(int i=0;i<words.length;i++) {
			j=0;
			if(!hm.containsKey(words[i])) {
				hm.put(words[i], 1);
			}
			else {
				hm.put(words[i], hm.get(words[i])+1);
			}
		}
		TreeMap<String,Integer> sortedMap=new TreeMap<>(hm);
		for(Map.Entry e:sortedMap.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
	}

}
