package test2;

import java.util.Arrays;
import java.util.TreeSet;

public class ReverseString {
	public static void reverse(String st) {
		String str="";
		for(int i=st.length()-1;i>=0;i--) {
			str=str+st.charAt(i);
		}
		System.out.println(str);
	}
	public static void greatestOfThree(int a,int b,int c) {
		if((a>b) && (a>c)) {
			System.out.println(a);
		}
		else if((b>a) &&(b>c)) {
			System.out.println(b);
		}
		else
		System.out.println(c);
	}
	public static void checkPrime(int a) {
		int c=0;
		for(int i=2;i<a;i++) {
			if(a%i==0)
				c=1;
		}
		if(c==1)
			System.out.println(a+" not prime number");
		else System.out.println(a+" prime number");
	}
	public static void primeList(int a) {
		for(int i=1;i<=a;i++) {
			int c=0;
			for(int j=1;j<=a;j++) {
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.print(i+" ");
		}
	}
	public static void reverseDigit(int a) {
		int sum=0;
		while(a>0) {
			int reminder=a%10;
			sum=sum*10+reminder;
			a=a/10;
		}
		System.out.println(sum);
	}
	public static void sumOfDigit(int a) {
		int sum=0;
		while(a>0) {
			int reminder=a%10;
			sum=sum+reminder;
			a=a/10;
		}
		System.out.println(sum);
	}
	public static void hcfNumber(int a,int b) {
		int hcf=1;
		for(int i=1;i<=a || i<=b;i++) {
			if(a%i==0 && b%i==0)
				hcf=i;
		}
		System.out.println(hcf);
	}
	public static void lcmNumber(int a,int b) {
		int hcf=1;
		for(int i=1;i<=a || i<=b;i++) {
			if(a%i==0 && b%i==0)
				hcf=i;
		}
		System.out.println(a*b/hcf);
	}
	public static void largestElements(int a[]) {
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large)
				large=a[i];
		}
		System.out.println(large);
	}
	public static void countCharacter(String st)
	{
		char arr[]=st.toCharArray();
		Arrays.sort(arr);
		int c;
		for(int i=0;i<arr.length;i=i+c) {
		 c=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j])
					c++;
			}
			System.out.println(arr[i]+" "+c);
		}
	}
	public static void largestWord(String a[]) {
		String large=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i].length()>large.length())
			large=a[i];
		
		}
		System.out.println(large);
	}
	public static void table(int a) {
		for(int i=1;i<=10;i++) {
			System.out.println("9"+"*"+i+"="+(9*i));
		}
	}
    public static void secondLargestNumber(Integer a[]) {
    	for(int i=0;i<a.length;i++) {
    		for(int j=i+1;j<a.length;j++) {
    			if(a[i]>a[j]) {
    				int temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    		System.out.println(a[i]);
    	}
    }
    @SuppressWarnings("unused")
	public static void secondElement(TreeSet<Integer> a) {
    	Object[] arr=a.toArray();
    	System.out.println(a);
    }
    public static void palindrome(String []a) {
    	
    	for(String st:a) {
    		String str="";
    		for(int i=st.length()-1;i>=0;i--) {
    			str=str+st.charAt(i);
    		}
    		if(str.equals(st)) {
    			System.out.print(st+", ");
    		}
    	}
    }
    public static void eachWordReverse(String st) {
    	String [] arr=st.split(" ");
    	
    	for(String a:arr) {
    		String sum="";
    		for(int i=a.length()-1;i>=0;i--) {
    			sum=sum+a.charAt(i);
    		
    		}
    		System.out.print(sum+" ");
    	}
    }
//    public static void sumOfElements(int arr[],int n) {
//    	String st="";
//    	for(int i=0;i<arr.length;i++) {
//    		for(int j=1;j<arr.length;j++) {
//    			if(arr[i]+arr[j]==n)
//    				st=st+" ";
//    		}
//    	}
//    	System.out.println(st);
//    }
	public static void main(String[] args) {
		//reverse("Rakesh");
		//greatestOfThree(100,20,50);
		//primeList(20);//checkPrime(18); //reverseDigit(2563);
		//hcfNumber(30,42);//sumOfDigit(2563);//lcmNumber(24,36);
		//int a[]= {10,20,50,45,20};//largestElements(a);
		//countCharacter("Rakeshaa");//table(9);
		//String []a= {"cat","rakesh","aryan","jhhdjdhfh"};	//largestWord(a);
		//Integer a[]= {5,6,2,78,12,22,63,2};//secondLargestNumber(a);
		//TreeSet<Integer> t=new TreeSet<Integer>(Arrays.asList(a));
		//secondElement(t);
		//System.out.println(a[a.length-2]);
		//String st[]= {"mom","usal","rakesh","mam"};
		//String st="Rakesh kumar saw";//palindrome(st);
		//eachWordReverse(st);
		//int b=30;sumOfElements(a,b);
	}

}
