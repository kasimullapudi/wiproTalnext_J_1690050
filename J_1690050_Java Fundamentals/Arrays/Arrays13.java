package pbl_app;

import java.util.*;

public class Arrays13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2d= {
				{Integer.parseInt(args[0]),Integer.parseInt(args[1])},
				{Integer.parseInt(args[2]),Integer.parseInt(args[3])}
				};
		int[][] arr2dnew= {{arr2d[1][1],arr2d[1][0]},{arr2d[0][1],arr2d[0][0]}};
		System.out.println(Arrays.toString(arr2dnew[0])+"\n"+Arrays.toString(arr2dnew[1]));
	}

}
