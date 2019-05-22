package HoWork;
import java.util.Scanner;

public  class Comparison implements IOperation {
	public String perform(String num1,String num2) {
		char cmp = num1.charAt(num1.length()-1);
		String ans=null;
		num1=num1.substring(0,num1.length()-1 );
		int count=0,count1=0,count2=0;
		
		if(num1.charAt(0)=='-') {
			
			num1=num1.substring(1,num1.length());
			
			count ++;
			count1 ++;
		}
		if(num2.charAt(0)=='-') {
			num2=num2.substring(1,num2.length());
			count++;
			count2++;
		}
		
		if (cmp == '<') {
			if(count==0) {
				if(num1.length()<num2.length()){
					ans="true";
				}
				else if(num1.length()>num2.length()) ans = "false";
				else if(num1.length()==num2.length()) {
					int tot1[]=new int[num1.length()];
					int tot2[]=new int[num1.length()];
					int i;
					for(i=0;i<num1.length();i++) {
						tot1[i]=num1.charAt(i)-'0';
						tot2[i]=num2.charAt(i)-'0';
					}
					for(i=0;i<num1.length();i++) {
						if(tot1[i]!=tot2[i] && tot1[i]>tot2[i])ans="false";
						else if(tot1[i]!=tot2[i] &&tot1[i]<tot2[i])ans="true";
					}
				}
			}
			else if(count ==1 && count1 ==1 ) {
				if(num1.length()<num2.length()){
					ans="true";
				}
				else if(num1.length()>num2.length()) ans = "true";
				else if(num1.length()==num2.length()) ans = "true";
			}
			else if(count == 1 && count2 ==1) {
				if(num1.length()<num2.length()){
					ans="false";
				}
				else if(num1.length()>num2.length()) ans = "false";
				else if(num1.length()==num2.length())ans = "false";
			}
			else if(count == 2) {
				if(num1.length()<num2.length()){
					ans="false";
				}
				else if(num1.length()>num2.length()) ans = "true";
				else if(num1.length()==num2.length()) {
					int tot1[]=new int[num1.length()];
					int tot2[]=new int[num1.length()];
					int i;
					for(i=0;i<num1.length();i++) {
						tot1[i]=num1.charAt(i)-'0';
						tot2[i]=num2.charAt(i)-'0';
					}
					for(i=0;i<num1.length();i++) {
						if(tot1[i]!=tot2[i] && tot1[i]>tot2[i])ans="true";
						else if(tot1[i]!=tot2[i] &&tot1[i]<tot2[i])ans="false";
					}
				}
				
			}
		}
		else if(cmp == '>') {
			if(count==0) {
				if(num1.length()<num2.length()){
					ans="false";
				}
				else if(num1.length()>num2.length()) ans = "true";
				else if(num1.length()==num2.length()) {
					int tot1[]=new int[num1.length()];
					int tot2[]=new int[num1.length()];
					int i;
					for(i=0;i<num1.length();i++) {
						tot1[i]=num1.charAt(i)-'0';
						tot2[i]=num2.charAt(i)-'0';
					}
					for(i=0;i<num1.length();i++) {
						if(tot1[i]!=tot2[i] && tot1[i]>tot2[i])ans="true";
						else if(tot1[i]!=tot2[i] &&tot1[i]<tot2[i])ans="false";
					}
				}
			}
			else if(count ==1 && count1 ==1 ) {
				if(num1.length()<num2.length()){
					ans="false";
				}
				else if(num1.length()>num2.length()) ans = "false";
				else if(num1.length()==num2.length()) ans = "false";
			}
			else if(count == 1 && count2 ==1) {
				if(num1.length()<num2.length()){
					ans="true";
				}
				else if(num1.length()>num2.length()) ans = "true";
				else if(num1.length()==num2.length())ans = "true";
			}
			else if(count == 2) {
				if(num1.length()<num2.length()){
					ans="true";
				}
				else if(num1.length()>num2.length()) ans = "false";
				else if(num1.length()==num2.length()) {
					int tot1[]=new int[num1.length()];
					int tot2[]=new int[num1.length()];
					int i;
					for(i=0;i<num1.length();i++) {
						tot1[i]=num1.charAt(i)-'0';
						tot2[i]=num2.charAt(i)-'0';
					}
					for(i=0;i<num1.length();i++) {
						if(tot1[i]!=tot2[i] && tot1[i]>tot2[i])ans="false";
						else if(tot1[i]!=tot2[i] &&tot1[i]<tot2[i])ans="true";
					}
				}
				
			}
		}
		else if(cmp== '=') {
			if(count == 0) {
				if(num1.length()<num2.length()){
					ans="false";
				}
				else if(num1.length()>num2.length()) ans = "false";
				else if(num1.length()==num2.length()) {
					int tot1[]=new int[num1.length()];
					int tot2[]=new int[num1.length()];
					int i;
					for(i=0;i<num1.length();i++) {
						tot1[i]=num1.charAt(i)-'0';
						tot2[i]=num2.charAt(i)-'0';
					}
					for(i=0;i<num1.length();i++) {
						if(tot1[i]!=tot2[i])ans="false";
						else ans="true";
					}
				}
			}
			else if(count ==1 &&count1==1) {
					ans="false";
			}
			else if(count ==1 &&count2==1) {
				ans="false";
			}
			else if(count==2) {
				if(num1.length()<num2.length()){
					ans="false";
				}
				else if(num1.length()>num2.length()) ans = "false";
				else if(num1.length()==num2.length()) {
					int tot1[]=new int[num1.length()];
					int tot2[]=new int[num1.length()];
					int i;
					for(i=0;i<num1.length();i++) {
						tot1[i]=num1.charAt(i)-'0';
						tot2[i]=num2.charAt(i)-'0';
					}
					for(i=0;i<num1.length();i++) {
						if(tot1[i]!=tot2[i])ans="false";
						else ans="true";
					}
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num=scan.nextLine();
		String[] sources = num.split(" ");
		String num1= sources[0]+sources[1];
		String num2 = sources[2];
		IOperation operation= new Comparison();
		System.out.println(operation.perform(num1, num2));

	}


}
