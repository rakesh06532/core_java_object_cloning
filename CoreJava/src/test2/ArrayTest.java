package test2;
import java.util.*;

public class ArrayTest {
	String s2[];
	public void test(int a[],int k) {
		System.out.print("{");
		for(int i=0;i<a.length;i++) {
			String s="";int sum=0;s2=null;
			for(int j=i;j<a.length;j++) {
				sum=sum+a[j];
				s=s+a[j]+",";
				if(sum==k) {
					s2=s.split(",");
				}
			}
			if(s2!=null)
				System.out.print(Arrays.deepToString(s2));
		}
		System.out.println("}");
	}
	boolean result=false;
	public boolean anagram(String st1,String st2) {
		char arr1[]=st1.toCharArray();
		char arr2[]=st2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		result=Arrays.equals(arr1, arr2);
		if(result==true)
			result=true;
		else result=false;
		return result;
	}
	public static void main(String[] args) {
		int k=18;
		int a[]= {4,2,12,6,5};
		new ArrayTest().test(a, k);
		System.out.println(new ArrayTest().anagram("listen", "silent"));
	}

}
