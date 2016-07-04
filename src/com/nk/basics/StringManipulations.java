package com.nk.basics;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="";  
		String s2="javatpoint";
		String s3=null;

		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());
//		System.out.println(s3.isEmpty());
		
		//===============String.join()=================
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  
		//==============================================
		
		System.out.println("--equals---");

		String a="meow";
		String ab=a+"deal";
		//String ab="meow"+"deal";
		
				//String ab=(a+"deal").intern();
				//gives true
		String abc="meowdeal";
		System.out.println(ab==abc);
		//System.out.println(ab.equals(abc));
				
		
		

	}

}