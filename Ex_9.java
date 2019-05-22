package itsa;
import java.util.Scanner;
public class Ex_9 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a;
		a=scan.nextInt();
		int i;
		int ans=0;
		for(i=0;i<a;i++) {
			if((a-i)%3==0) {
				ans=ans+a-i;
			}
		}
		System.out.println(ans);
	}

}
