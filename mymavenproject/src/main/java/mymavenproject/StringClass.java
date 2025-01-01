
package mymavenproject;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello";
		System.out.println(s);
		String s1=new String("World");
		System.out.println(s1);
		char[] c= {'a','b','c','d','e'};//convert char array to string
		String s2=new String(c);
		System.out.println(s2);
		//length, to find the size of a string
		int a=s.length();
		System.out.println(a);
		
		//charAt, to display a specific character
		char b=s.charAt(0);
		System.out.println(b);
		
		//concat, to add two strings
		System.out.println(s.concat(s1));
		//contains, to check if a string is present or not
		String sent="I am loving and caring";
		System.out.println(sent.contains("loving"));
		System.out.println(sent.contains("that"));
		System.out.println(sent.contains("l"));
		
		//valueOf, to convert from int/double type to string(type conversion)
		int st=5;
		String str=String.valueOf(st);
		System.out.println(str);
		
		//toUppercase
		System.out.println(sent.toUpperCase());
		
		//toLowercase
		String up="WELCOME";
		System.out.println(up.toLowerCase());
		
		//equals, to compare two strings
		String str1="java";
		String str2="Java";
		String str3="Selenium";
		String str4="java";
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		
		//equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		//isEmpty, to check if a string is empty or not
		String str5="";
		String str6="is";
		System.out.println(str5.isEmpty());
		System.out.println(str6.isEmpty());
		
		String str7="Aleena";
		String str8="Aleena";
		//comparing the string references
		System.out.println(str7==str8);
		//here using new keyword it compares two string locations
		String str9=new String("Aleena");
		System.out.println(str7==str9);
		
	}

}
