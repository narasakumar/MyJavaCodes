package com.nk.basics;

class Bike10{  
	  final int speedlimit;//blank final variable  
	    
	  Bike10(){  
		  //Can initiate final variable only in constructor
	  speedlimit=70;  
	  System.out.println(speedlimit);  
	  }  
	  
	  public static void main(String args[]){  
	    new Bike10();  
	 }  
	}  