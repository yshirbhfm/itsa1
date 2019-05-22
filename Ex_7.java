package itsa;
import java.util.Scanner;
public class Ex_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		String op;
		int a1,b1,a2,b2;
		n=scan.nextInt();
		String str=scan.nextLine();
		for(int i =0;i<n;i++) {
			op=scan.next();
			a1=scan.nextInt();
			a2=scan.nextInt();
			b1=scan.nextInt();
			b2=scan.nextInt();
			
			if(op.equals("+")) {
				System.out.println((a1+b1)+" "+(a2+b2));
			}
			else if(op.equals("-")) {
				System.out.println((a1-b1)+" "+(a2-b2));
			}
			else if(op.equals("*")) {
				System.out.println(((a1*b1)-(a2*b2))+" "+((a2*b1)+(a1*b2)));
			}
			
		}
		
	}
}
