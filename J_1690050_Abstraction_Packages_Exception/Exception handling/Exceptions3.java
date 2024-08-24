package pbl_app_Abstraction_Packages_Exception;
import java.util.*;
public class Exceptions3 extends Exception {
	public Exceptions3() {
		
	}
	public Exceptions3(String string) {
		super(string);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String[] stud=new String[2];
		int[] avg=new int[2];
		int marks=0;
		int i=0;
		try {
			while(i<2) {
				System.out.printf("***===Enter name of Student %d===***\n",i+1);
				stud[i]=in.next();
				for(int j=0;j<3;j++) {
					System.out.printf("Enter subject %d marks: ",j+1);
					marks=in.nextInt();
					if(marks<0) {
						throw new Exceptions3("\n<<< Please Enter positive integer >>>");
					}
					if(!(marks>=0 && marks<=100)) {
						throw new Exceptions3("\n<<< Please Enter value between 0 and 100 >>>");
					}
					avg[i]+=marks;
				}
				avg[i]/=3;
				i++;
				System.out.println();
			}
			System.out.printf("Averge Marks of %s: %d\n",stud[0],avg[0]);
			System.out.printf("Averge Marks of %s: %d",stud[1],avg[1]);
			
		}
		catch(InputMismatchException ie) {
			System.out.println("Please enter an integer");
		}
		catch(Exceptions3 e) {
			System.out.println(e.getMessage());
		}
		finally {
			in.close();
		}
		
	}

}
