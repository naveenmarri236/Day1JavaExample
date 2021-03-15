package com.day4;

public class Example7 {

	public static void main(String[] args) {
		String s1="hello";
		System.out.println(s1.charAt(1));
		
		String s2="this is a Demo of getchar methosd";
		int start=10,end=14;
		char buf[]=new char[end-start];
		s2.getChars(10,14,buf,0);
		System.out.println(buf);
		
		String s3="hello";
		System.out.println(s3.length());
		
		String s4="ABCD";
		byte[] b=s4.getBytes();
		for(byte b1:b) {
			System.out.println(b1);
			
			String s5="Java";
			char c[]=s5.toCharArray();
			for(char c1:c) {
				System.out.println(c1);
				
				String s6="footbar";
				System.out.println(s6.endsWith("foo"));
				System.out.println(s6.endsWith("bar"));
				
				String s7=new String("hello");
				String s8=new String("HELLO");
				String s9=new String("hello");
				System.out.println("****************");
				System.out.println(s7.equals(s8));
				System.out.println(s7.equals(s9));
				System.out.println(s7.equalsIgnoreCase(s8));
				System.out.println(s7==s8);
				String s10=s8;
				System.out.println(s10==s8);
				
				System.out.println(s7.toUpperCase());
				System.out.println(s8.toLowerCase());
				
				String s11="helloworld";
				System.out.println(s11.substring(6));//orld
				System.out.println(s11.substring(2, 5));
				
				
				String s12="hello";
				String s13=new String("hello");
				System.out.println(s12.concat(" world"));
				System.out.println(s12.length());
				System.out.println(s13.concat(" world"));
				System.out.println(s13.length());
					
				String s14="hello";
				System.out.println(s14.replace('e', 'i'));
				
				String s15=" hello world ";
				System.out.println(s15.length());
				System.out.println(s15.trim());
				System.out.println(s15.length());
				System.out.println(">>>>>>>>>>>>>>>>");
				String s16=s15.strip();
				System.out.println(s16.length());
				System.out.println("////////");
				
				String s17="Now is the time for all goomen to "+
							"come to their country and pay the due taxes";
				System.out.println(s17.indexOf('t'));  //7
				System.out.println(s17.indexOf("the"));  //7
				System.out.println(s17.indexOf('t',9));  //11
				System.out.println(s17.indexOf("the",10));  //42
				System.out.println(s17.indexOf("oooo"));   //-1
				System.out.println(s17.lastIndexOf('t'));  //72
				System.out.println(s17.lastIndexOf("the"));   //64
				String s18="one-two-three";
				String temp[]=s18.split("-");
				for(String temp1:temp) {
					System.out.println(temp1);
					
				}
				
				String s19="one.two.three.four.five";
				String temp2[]=s19.split("\\.",3);
				for(String a:temp2) {
					System.out.println(a);
				}
				String s20="A*bunch*of*stars";
				String tem2[]=s20.split("\\*");
				for(String a2:tem2) {
					System.out.println(a2);
				}
				String s23="Welcome to Java program";
				System.out.println(s23.matches("(.*)Java(.*)"));
				System.out.println(s23.matches("Java(.*)"));
				System.out.println(s23.matches("Welcome(.*)"));
				
				String s24="ABC Windows test";
				boolean b2=s24.regionMatches(true,4,"Windows",0,7);
				System.out.println(b2);
				
				
				
				
			}
		}
		

	}

}
