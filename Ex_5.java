package itsa;
import java.util.Scanner;
public class Ex_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a=scanner.nextInt();
            int x=a,y=0;
            String s="";
            if(a<0){
                x=256+a;
            }
            for(int i=0;i<8;i++){
                y=x%2;
                s=Integer.toString(y)+s;
                x=x/2;
            }
            System.out.println(s);
        }
        scanner.close();

	}

}
