package itsa;
import java.util.Scanner;
public class Ex_6 {

	public static void main(String[] args) {
		int month;
		Scanner scan=new Scanner(System.in);
		month = scan.nextInt();
		
		if(3<=month&&month<=5)System.out.println("Spring");
		else if(6<=month&&month<=8)System.out.println("Summer");
		else if(9<=month&&month<=11)System.out.println("Autumn");
		else System.out.println("Winter");
		
		

	}

}
