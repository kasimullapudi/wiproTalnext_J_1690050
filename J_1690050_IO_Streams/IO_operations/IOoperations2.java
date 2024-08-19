package pbl_app_IO;
import java.util.*;
import java.io.*;

public class IOoperations2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input file name: ");
		String fileIn=new String(sc.next());
		System.out.println("Enter the output file name: ");
		String fileOut=new String(sc.next());
		char c;
		int inpSize;
		File fin=null;
		File fout=null;
		
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			fin=new File("D:/kasi/"+fileIn);
			fout=new File("D:/kasi/"+fileOut);
			
			in=new FileInputStream(fin);
			out=new FileOutputStream(fout);
			inpSize=in.available();
			while(inpSize--!=0) {
				c=(char)in.read();
				out.write(c);
			}
			System.out.println("File is Copied");
		}
		catch(IOException ie) {
			System.out.println("File Error");
		}
		finally {
			if(in!=null)in.close();
			if(out!=null)out.close();
			sc.close();
		}
	}

}
