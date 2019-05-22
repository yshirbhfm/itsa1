package HoWork;

public class Subtraction implements IOperation {
	public String perform(String num1, String num2) {
		  int count=0;
		  int count1=0;
		  int count2=0;
		  
		  if(num1.charAt(0)=='-') {
		   num1=num1.substring(1,num1.length());
		   count++;
		   count1++;
		  }
		  
		  if(num2.charAt(0)=='-') {
			  num2=num2.substring(1,num2.length());
			  
		  }
		  else {
			  num2=num2;
			  count ++;
			  count2++;
		  }
		  if(num1.equals("0") && count2==0) {
			  return num2;
		  }
		  else if(num1.equals("0") && count2==1) {
			  return "-"+num2;
		  }
		  
		  
		  if(num1.length()>num2.length()) {
			  	int[] countnum1= new int[num1.length()+1];
			  	int[] countnum2 = new int [num1.length()+1];
			  	int i;
			  	for(i=1;i<num1.length()+1;i++) {
			  		countnum1[i]=num1.charAt(i-1)-'0';
			  	}
			  	for(i=1;i<num2.length()+1;i++) {
			  		countnum2[i+num1.length()-num2.length()]=num2.charAt(i-1)-'0';
			  	}

		  
		   
			  	if(count==0) {  
			  		for(i=0;i<countnum1.length;i++) {
			  			countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+countnum2[countnum1.length-i-1];
			  			if((countnum1[countnum1.length-i-1]/10)>0) {
			  				countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]+1;
			  				countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-10;
			  			}
			  		}
			  	}
			  	else if(count==1 && count2 ==1) {
			  		for(i=0;i<countnum1.length;i++) {
			  			countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-countnum2[countnum1.length-i-1];
			  			if(countnum1[countnum1.length-i-1]<0) {
			  				countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]-1;
			  				countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+10;
			  			}
			  		}
			  	}
			  	else if(count==1 && count1 ==1) {
			  		for(i=0;i<countnum1.length;i++) {
			  			countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-countnum2[countnum1.length-i-1];
			  			if(countnum1[countnum1.length-i-1]<0) {
			  				countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]-1;
			  				countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+10;
			  			}
			  		}
			  	}
			  	else if(count==2) {
			  		for(i=0;i<countnum1.length;i++) {
			  			countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+countnum2[countnum1.length-i-1];
			  			if((countnum1[countnum1.length-i-1]/10)>0) {
			  				countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]+1;
			  				countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-10;
			  			}
			  		}
			  	}

			  	
			  	String ans=String.valueOf(countnum1[0]);
				String[] str = new String[num1.length()]; 
				for(i=1;i<(countnum1.length);i++) {
					str[i-1]=String.valueOf(countnum1[i]);
					ans=ans+str[i-1];
				} 
				System.out.println(ans);
				if(num1!="0") {
				if(count==0) {
					 num1=ans.replaceFirst("^0*", "");
				 }
				 else if(count==2) {
					 num1="-"+ ans.replaceFirst("^0*", "");
				 }
				 else if(count1==1) {
					 num1="-"+ ans.replaceFirst("^0*", "");
				 }
				 else if(count == 0) {
					 num1=ans.replaceFirst("^0*", "");
				 }
				
				}

		  	}
			  	
			  	
		  else if(num1.length()<num2.length()) {
			   String str3;
			   str3=num2;
			   num2=num1;
			   num1=str3;
			   int[] countnum1= new int[num1.length()+1];
			   int[] countnum2 = new int [num1.length()+1];
			   
			   int i;
			   for(i=1;i<num1.length()+1;i++) {
			    countnum1[i]=num1.charAt(i-1)-'0';
			   }
			   for(i=1;i<num2.length()+1;i++) {
				   countnum2[i+num1.length()-num2.length()]=num2.charAt(i-1)-'0';
			   }



			   if(count==0) {  
				   for(i=0;i<countnum1.length;i++) {
					   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+countnum2[countnum1.length-i-1];
					   if((countnum1[countnum1.length-i-1]/10)>0) {
						   countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]+1;
						   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-10;
					   }
				   }
			   }
			   else if(count==1 && count2 ==1) {
				   for(i=0;i<countnum2.length;i++) {
					   countnum2[countnum2.length-i-1]=countnum2[countnum2.length-i-1]-countnum1[countnum2.length-i-1];
					   if(countnum2[countnum2.length-i-1]<0) {
						   countnum2[countnum2.length-i-2]=countnum2[countnum2.length-i-2]-1;
						   countnum2[countnum2.length-i-1]=countnum2[countnum2.length-i-1]+10;
					   }
				   }
			   }
			   else if(count==1 && count1 ==1) {
				   for(i=0;i<countnum1.length;i++) {
					   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-countnum2[countnum1.length-i-1];
					   if(countnum1[countnum1.length-i-1]<0) {
						   countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]-1;
						   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+10;
					   }
				   }
			   }
			   else if(count==2) {
				   for(i=0;i<countnum1.length;i++) {
					   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+countnum2[countnum1.length-i-1];
					   if((countnum1[countnum1.length-i-1]/10)>0) {
						   countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]+1;
						   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-10;
					   }
				   }
			   }
			   String ans=String.valueOf(countnum1[0]);
				String[] str = new String[num1.length()]; 
				for(i=1;i<(countnum1.length);i++) {
					str[i-1]=String.valueOf(countnum1[i]);
					ans=ans+str[i-1];
				} 
				System.out.println(ans);
				if(num1!="0") {
				if(count==0) {
					 num1=ans.replaceFirst("^0*", "");
				 }
				 else if(count==2) {
					 num1="-"+ ans.replaceFirst("^0*", "");
				 }
				 else if(count2 == 1){
					 num1="-"+ ans.replaceFirst("^0*", "");
				 }
				 else if(count2 == 0) {
					 num1=ans.replaceFirst("^0*", "");
				 }
				}
				
		  } 
		  
		  else if(num1.length()==num2.length()) {
			  int[] countnum1= new int[num1.length()+1];
			  int[] countnum2 = new int [num1.length()+1];
			  int i;
			  for(i=1;i<num1.length()+1;i++) {
				  countnum1[i]=num1.charAt(i-1)-'0';
			  }
			  for(i=1;i<num2.length()+1;i++) {
			  		countnum2[i+num1.length()-num2.length()]=num2.charAt(i-1)-'0';
			  }
			  int cmp=0;
			  if(count==0) {  
				   for(i=0;i<countnum1.length;i++) {
					   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+countnum2[countnum1.length-i-1];
					   if((countnum1[countnum1.length-i-1]/10)>0) {
						   countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]+1;
						   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-10;
					   }
				   }
			   }
			   else if(count==1 && count2 ==1) {
				   cmp=0;
				   for(i=0;i<countnum1.length;i++) {
		
					   if(countnum1[i]!= countnum2[i]) {
						  if(countnum1[i]>countnum2[i] ) {
							  cmp=1;
						  }
						  break; 
					   }
				   }
				   
				   if(cmp==0) {
					   	for(i=0;i<countnum1.length;i++) {
						   	countnum2[countnum1.length-i-1]=countnum2[countnum1.length-i-1]-countnum1[countnum1.length-i-1];
					   		if(countnum2[countnum1.length-i-1]<0) {
						   		countnum2[countnum2.length-i-2]=countnum2[countnum2.length-i-2]-1;
						   		countnum2[countnum2.length-i-1]=countnum2[countnum2.length-i-1]+10;
					   		}
					    }
					    int[] change = new int[countnum1.length];
				   		for(i=0;i<countnum1.length;i++) {
					   		change[i]=countnum1[i];
					   		countnum1[i]=countnum2[i];
					   		countnum2[i]=change[i];
				   		}
				   }
				   else {
					   for(i=0;i<countnum1.length;i++) {
						   	countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-countnum2[countnum1.length-i-1];
					   		if(countnum1[countnum1.length-i-1]<0) {
						   		countnum1[countnum2.length-i-2]=countnum1[countnum1.length-i-2]-1;
						   		countnum1[countnum2.length-i-1]=countnum1[countnum1.length-i-1]+10;
					   		}
					   }
				   }
			   }

			   else if(count==1 && count1 ==1) {
				   cmp=0;
				   for(i=0;i<countnum1.length;i++) {
		
					   if(countnum1[i]!= countnum2[i]) {
						  if(countnum1[i]>countnum2[i] ) {
							  cmp=1;
						  }
						  break; 
					   }
				   }
				   
				   if(cmp==0) {
					   for(i=0;i<countnum1.length;i++) {
						   countnum2[countnum1.length-i-1]=countnum2[countnum1.length-i-1]-countnum1[countnum1.length-i-1];
						   if(countnum2[countnum1.length-i-1]<0) {
							   countnum2[countnum2.length-i-2]=countnum2[countnum2.length-i-2]-1;
							   countnum2[countnum2.length-i-1]=countnum2[countnum2.length-i-1]+10;
						   }
					   }
					   int[] change = new int[countnum1.length];
					   for(i=0;i<countnum1.length;i++) {
						   change[i]=countnum1[i];
						   countnum1[i]=countnum2[i];
						   countnum2[i]=change[i];
					   }
				   }
				   else {
					   
					   for(i=0;i<countnum1.length;i++) {
						   	countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-countnum2[countnum1.length-i-1];
					   		if(countnum1[countnum1.length-i-1]<0) {
						   		countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]-1;
						   		countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+10;
					   		}
					   }
				   }
			   }
			   
			   else if(count==2) {
				   for(i=0;i<countnum1.length;i++) {
					   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]+countnum2[countnum1.length-i-1];
					   if((countnum1[countnum1.length-i-1]/10)>0) {
						   countnum1[countnum1.length-i-2]=countnum1[countnum1.length-i-2]+1;
						   countnum1[countnum1.length-i-1]=countnum1[countnum1.length-i-1]-10;
					   }
				   }
			   }		 
		 
		  
			  
			  String ans=String.valueOf(countnum1[0]);
			  String[] str = new String[num1.length()]; 
		 for(i=1;i<(countnum1.length);i++) {
			 str[i-1]=String.valueOf(countnum1[i]);
			 ans=ans+str[i-1];
		 } 
		 
		 
		 //int result = Integer.parseInt(ans);
		 
		 if(num1!="0") {
		 if(count==0) {
			 num1=ans.replaceFirst("^0*", "");
		 }
		 else if(count==2) {
			 num1="-"+ ans.replaceFirst("^0*", "");
		 }
		 else if(count1==1 && cmp==1){
			 num1="-"+ ans.replaceFirst("^0*", "");
		 }
		 else if(count1==1 && cmp==0) {
			 num1=ans.replaceFirst("^0*", "");
		 }
		 else if(count2==1 && cmp ==1 ) {
			 num1=ans.replaceFirst("^0*", "");
		 }
		 else if(count2==1 && cmp==0) {
			 num1="-"+ ans.replaceFirst("^0*", "");
		 }
		 }
		 
		 
	}
	
	return num1;
}
	public static void main(String[] args) {
		String num1= "0";
		String num2="1";
		Subtraction  sub=new Subtraction();
		System.out.println(sub.perform(num1,num2));
	}

}
