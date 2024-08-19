package pbl_app_IO;
import java.util.*;
import java.io.*;
public class IOoperations1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		File input=null;
		FileInputStream in=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name: "); //source.txt
		String file=sc.next();
		System.out.println("Enter character to be counted");
		char character=sc.next().charAt(0);
		try {
			
			input=new File("D:/kasi/"+file);
			in=new FileInputStream(input);
			
			int charCount=0;
			int size=in.available();
			while((size--)!=0) {
				c=(char)in.read();
				if(c==character) {
					charCount++;
				}
				
			}
			System.out.println("'"+character+"' appeared "+charCount+" times in the file "+file);
		}
		catch(IOException fe) {
			System.out.println("The file name you entered is not found");
		}
		finally {
			in.close();
			sc.close();
		}
		
		
		
	}

}
