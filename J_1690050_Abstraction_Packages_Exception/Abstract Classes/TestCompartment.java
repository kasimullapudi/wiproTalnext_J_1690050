package pbl_app_Abstraction_Packages_Exception;
abstract class Compartment{
	public abstract String notice();
}
class Firstclass extends Compartment{

	public String notice() {
		return "Notice of Firstclass Compartment";
	}
}
class Ladies extends Compartment{
	public String notice() {
		return "Notice of Ladies Compartment";
	}
}
class General extends Compartment{

	public String notice() {
		return "Notice of General Compartment";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "Notice of Luggage Compartment";
	}
}


public class TestCompartment  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment arr[]=new Compartment[10] ;
		int rand;
		
		for(int i=0;i<10;i++) {
			rand=(int)(Math.random()*10)%4+1;
			switch(rand) {
			case 1:
				arr[i]= new Firstclass();
				break;
			
			case 2:
				arr[i]=new Ladies();
				break;
			case 3:
				arr[i]=new General();
				break;
			default:
				arr[i]=new Luggage();
			}
			System.out.println(arr[i].notice());
		}
	}

}
