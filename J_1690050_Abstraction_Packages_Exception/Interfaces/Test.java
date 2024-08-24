package live;
import music.Playable;
import music.string.*;
import music.wind.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v =new Veena();
		Saxophone s=new Saxophone();
		v.play();
		s.play();
		Playable p;
		p=new Veena();
		p.play();
		p=new Saxophone();
		p.play();
	}
}
