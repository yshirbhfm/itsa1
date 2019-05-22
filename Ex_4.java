package itsa;
import java.util.Scanner;
public class Ex_4 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int min1, min2;
		double hour1, hour2;
		String enter;
		hour1=scan.nextDouble();
		min1=scan.nextInt();
		enter=scan.nextLine();
		hour2=scan.nextDouble();
		min2=scan.nextInt();
		
		
		System.out.println(hour2);
		System.out.println(hour1);
		int price=0;
		if((min2-min1)<-30) {
			hour2=hour2-hour1-1;
			if(hour2<=2)price=(int)hour2*30*2;
			else if(2<hour2 && hour2<=4) price=(int)(hour2-2)*40*2+4*30;
			else if(4<hour2)price=(int)(hour2-4)*60*2+4*30+4*40;
		}
		else if((min2-min1)>30) {
			hour2=hour2-hour1+0.5;
			if(hour2<=2)price=(int)hour2*30*2;
			else if(2<hour2 && hour2<=4) price=(int)(hour2-2)*40*2+4*30;
			else if(4<hour2)price=(int)(hour2-4)*60*2+4*30+4*40;
		}
		else {
			hour2=hour2-hour1-0.5;
			if(hour2<=2)price=(int)hour2*30*2;
			else if(2<hour2 && hour2<=4) price=(int)(hour2-2)*40*2+4*30;
			else if(4<hour2)price=(int)(hour2-4)*60*2+4*30+4*40;
		}
		System.out.println(price);
	}
}
