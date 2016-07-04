package com.nk.basics;

import java.util.Date;

		public class SwitchExample2 {  
			public static void main(String[] args) {
				
				Date from =new Date();
				
			    int number=20;  
			    switch(number){  
			    case 10: System.out.println("10");  
			    case 20: System.out.println("20");  
			    case 30: System.out.println("30");  
			    default:System.out.println("Not in 10, 20 or 30");  
			    }
			    Date to=new Date();
			    System.out.println(to.getTime()-from.getTime());
			}  
			}  
	
