package test2;

public class BalanceParentheses {
	boolean result=false;int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
	public boolean isParenthesesBalance(String st) {
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='(')
				c1++;
			if(st.charAt(i)==')')
				c2++;
			if(st.charAt(i)=='{')
				c3++;
			if(st.charAt(i)=='}')
				c4++;
			if(st.charAt(i)=='[')
				c5++;
			if(st.charAt(i)==']')
				c6++;
			if((c1==c2) && (c3==c4) && (c5==c6))
				result=true;
			else result=false;
		}
		return result;
	}
	public static void main(String[] args) {
		String st="({}[)]";
		System.out.println(new BalanceParentheses().isParenthesesBalance(st));
	}

}
