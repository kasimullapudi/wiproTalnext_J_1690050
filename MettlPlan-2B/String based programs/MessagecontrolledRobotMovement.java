package mettl2B;
import java.util.*;
public class MessagecontrolledRobotMovement {
	//30m 2s
	public String moveRobot(int input1,int input2,String input3,String input4) {
		// Write code here...
		// throw new UnsupportedOperationException("moveRobot(int input1,int input2,String input3,String input4)");
        String[] chDir={"ER","EL","WR","WL","NR","NL","SR","SL"};
        char[] dirs={'S','N','N','S','E','W','W','E'};
        HashMap<String,Character> dir =new HashMap<>();
        for(int i=0;i<dirs.length;i++){
            dir.put(chDir[i], dirs[i]);
        }
        String[] s=input3.split("-");
        int x=con(s[0].charAt(0)),y=con(s[1].charAt(0));
        char d=s[2].charAt(0);
        int inv=0;
        char[] instr=toChar(input4);
        // System.out.println(Arrays.toString(instr));
        for(char i :instr){
            if((char)i=='M'){
                if(d=='E' && x+1<=input1)x++;
                else if(d=='W' && x-1>=0)x--;
                else if(d=='N' && y+1 <=input2)y++;
                else if(d=='S' && y-1>=0) y--;
                else{inv++;break;}
            }
            else if(i=='R' || i=='L'){
                d=dir.get(""+d+i);
            }
            else{
                inv++;
                break;
            }
        }

       return inv>0 ? String.format("%d-%d-%c-ER",x,y,d) : String.format("%d-%d-%c",x,y,d);
	}

    public static int con(char c){
        return Integer.parseInt(c+"");
    }
    
    
    
    public static char[] toChar(String s){
        String n="";
        for(char i:s.toCharArray()){
            if(i==' '|| i==','){
                continue;
            }
            n+=(char)i;
        }
        return n.toCharArray();
    }

}
