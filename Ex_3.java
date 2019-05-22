package itsa;
import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		String source;
		source = scan.nextLine();
		x=source.charAt(0)-'0';
		y=source.charAt(1)-'0';
		
		if((x*y)<=10000 && x<=100 &&y<=100)System.out.println("inside");
		else System.out.println("outside");
	

	}

}
