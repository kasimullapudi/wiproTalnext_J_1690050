package pbl_app_Oops;
import java.util.*;

class Box{
    int height,width,depth;
    
    public Box(int height,int width,int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    int volume(){
        return height*width*depth;
    }
    
}

public class Classes1
{
    
	public static void main(String[] args) {
		Box box = new Box(10,20,30);
		System.out.println(box.volume());
		
	}
}
