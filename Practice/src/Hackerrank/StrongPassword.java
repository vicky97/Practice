package Hackerrank;

public class StrongPassword {

	public static void main(String[] args) {
		String s="Ab1";
		System.out.println(minimumNumber(s.length(),s));
	}
	
	 static int minimumNumber(int n, String password) {
		 int flag1=0,flag2=0,flag3=0,flag4=0;		
		 		String numbers = "0123456789";
		 		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		 		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String  special_characters = "!@#$%^&*()-+";
		 
		 char c[]=password.toCharArray();
		 
		 for(char x:c)
		 {
			 if(flag1==0&& lower_case.contains(x+""))
				 flag1=1;
			 if(flag2==0&& upper_case.contains(x+""))
				 flag2=1;
			 if(flag3==0&& numbers.contains(x+""))
				 flag3=1;
			 if(flag4==0&& special_characters.contains(x+""))
				 flag4=1;
			 
			 if(flag1==1 && flag2==1 && flag3==1 && flag4==1)
				 break;
		 }
		int boxCount=(flag1==0 ? 1 : 0) + (flag2==0 ? 1 : 0) + (flag3==0 ? 1 : 0)+ (flag4==0 ? 1 : 0); 
		 int count=(6-n>boxCount)?6-n:boxCount;
		 
		 
		 
		 
		 return count;
		
	    }
}
