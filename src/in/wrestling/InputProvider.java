package in.wrestling;

import java.util.Scanner;

public class InputProvider {
	
	Scanner s;
	
	public InputProvider(){
		this.s = new Scanner(System.in);
	}
	
	public int getInt(String message) {
		System.out.println(message);
		return s.nextInt();
	}

}
