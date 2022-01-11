import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
	
	ArrayList<Object> x = new ArrayList();
	x.add(5);
	x.add("Test");
	System.out.println(x.get(0));
	x.remove(0);
	System.out.println(x.get(0));
	
	}
}