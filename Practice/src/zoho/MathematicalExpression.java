package zoho;

import java.util.Stack;

public class MathematicalExpression {
	public static void main(String[] args) {
		String s="(a+b)(a*b)";
		char a[]=s.toCharArray();
		int flag=0;
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='(') st.push(a[i]);
			else if(a[i]==')' && st.peek()=='(') st.pop();
			else if(isoperator(a[i]) && isoperand(a[i-1])&&isoperand(a[i+1])) {}
			else if(isoperand(a[i])) {}
			else flag=1;
		}
		
		if(flag==0 && st.empty()) System.out.println("Valid");
		else System.out.println("Invalid");
	}

	 static boolean isoperator(char c) {
		// TODO Auto-generated method stub
		switch(c)
		{
		case '+':
		case '-':
		case '*':
		case '/': return true;
		}
		 return false;
	}

	 static boolean isoperand(char c) {
		// TODO Auto-generated method stub
		if(c>='a' && c<='z')
			return true;
		 
		return false;
	}
}
