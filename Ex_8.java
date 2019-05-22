package itsa;
import java.util.Scanner;
public class Ex_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);     
		    int a = sc.nextInt();             
			for(int i=2;i<=a-1;i++){     
		    if(a%i==0)  {   
			   System.out.println("NO");      
		    break;   
		    }else if(i==(a-1)){   
			System.out.println("YES");      
		    }


	   }
	}
	}