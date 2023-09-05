package test2;

public class substring {
public static void main(String[] args) {
	String s="rakesh";
	String st1=s.substring(0,1);
	String st2=s.substring(s.length()-1,s.length());
	String str=st2+s.substring(1,s.length()-1)+st1;
	System.out.println(str);
}
}
