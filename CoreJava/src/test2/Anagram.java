package test2;

import java.util.Arrays;

public class Anagram {
	boolean result=false;
	public boolean checkAnagram(String s1,String s2) {
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
	  result=Arrays.equals(arr1,arr2);
	  if(result==true)
     return result;
	  else return result;
	}
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
	System.out.println(	new Anagram().checkAnagram(s1,s2));
	}

}
