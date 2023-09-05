package test2;
import java.util.*;
public class SubArray {
	String s2[];
	public void meth1(int a[],int k) {
		System.out.print("{");
		for(int i=0;i<a.length;i++) {
			String s="";
			int sum=0;
			 s2=null;
			for(int j=i;j<a.length;j++) {
				sum=sum+a[j];
				s=s+a[j]+" ";
				if(sum==k) {
					s2=s.split(",");
				}
			}
			if(s2!=null)
				System.out.print(Arrays.deepToString(s2));
		}
		System.out.print("}");
	}
	public static void main(String[] args) {
		int k=18;
		int a[]= {4,2,12,5,6};
		new SubArray().meth1(a, k);
	}

}
