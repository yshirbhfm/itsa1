package HoWork;
import HoWork.Addition;
import HoWork.Subtraction;
import HoWork.Comparison;
import java.util.Scanner;//0的地方還要加強

public class Hw6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num=scan.nextLine();
		String[] sources = num.split(" ");
		
		if(sources[1].equals("=") || sources[1].equals("<")||sources[1].equals(">")) {
			IOperation operation= new Comparison();
			String num1= sources[0]+sources[1];
			String num2 = sources[2];
			System.out.println(operation.perform(num1,num2));
		}
		else if(sources[1].equals("+") && sources.length==3) {
			IOperation operation= new Addition();
			
			String num1 = sources[0];
			String num2 = sources[2];
			
			if(num1.equals("0")&&num2.equals("0"))System.out.println("0");
			else if(operation.perform(num1,num2).equals("-")||operation.perform(num1,num2).equals("")) {
				System.out.println("0");
			}
			else{
				System.out.println(operation.perform(num1,num2));
			}
		}
		else if(sources[1].equals("-") && sources.length==3) {
			IOperation operation= new Subtraction();
			String num1 = sources[0];
			String num2 = sources[2];
			if(num1.equals("0")&&num2.equals("0"))System.out.println("0");
			else if(operation.perform(num1,num2).equals("-")||operation.perform(num1,num2).equals("")) {
				System.out.println("0");
			}
			else System.out.println(operation.perform(num1, num2));
		}
		else if(sources.length>3) {
			IOperation operation1= new Addition();
			IOperation operation2= new Subtraction();
			int compareElement = sources.length/2;
			char[] element = new char[compareElement];
			char[] realElement = new char[compareElement];
			int i=0,j=0;
			int count=0;
			String[] realSources = new String[compareElement+1];
			i=1;
			String num1=null;
			for(j=0;j<compareElement;j++) {
				element[j]=sources[i].charAt(0);
				i=i+2;
				
			}
			int check=0;
			
			if(!sources[0].equals("0")) {
				realSources[0]=sources[0];
				check++;
			}
			if(check==1) {
				i=0;
				for(j=2;j<(2*compareElement)+1;j=j+2) {
					if(!sources[j].equals("0")) {
						realSources[i+1]=sources[j];
						realElement[i]=sources[j-1].charAt(0);
						count++;
						i++;
					}
				}
				num1=realSources[0];
				for(i=0;i<count;i++) {
					if(realElement[i]=='+') {
						num1=operation1.perform(num1, realSources[i+1]);
						if(num1.equals("-")&&i==count-1||num1.equals("")) {
							num1="0";
						}
					}
					else if(realElement[i]=='-') {
						
						num1=operation2.perform(num1, realSources[i+1]);
						if(num1.equals("-")&&i==count-1||num1.equals("")) {	
							num1="0";
						}
					}
				}
			}
			else if(check==0) {
				i=0;
				for(j=2;j<(2*compareElement)+1;j=j+2) {
					if(!sources[j].equals("0")) {
						realSources[i]=sources[j];
						realElement[i]=sources[j-1].charAt(0);
						count++;
						i++;
					}
				}
				num1="0";
			
				for(i=0;i<count;i++) {
					if(realElement[i]=='+') {
						num1=operation1.perform(num1, realSources[i]);
						if(num1.equals("-")&&i==count-1||num1.equals("")) {
							num1="0";
						}
					}
					else if(realElement[i]=='-') {
						
						num1=operation2.perform(num1, realSources[i]);
						if(num1.equals("-")&&i==count-1||num1.equals("")) {	
							num1="0";
						}
					}
				}
			}
			/*i=0;
			for(j=0;j<(2*compareElement)+1;j=j+2) {
				if(!sources[j].equals("0")) {
					
					realSources[i]=sources[j];
					if(i<compareElement-1)realElement[i]=sources[j+1].charAt(0);
					count++;
					System.out.println(realElement[i]);
					i++;
				}
			}
			System.out.println(count);*/
			i=1;

			System.out.println(num1);
			
		}
	}

}
