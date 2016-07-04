package com.nk.basics;

class Bike7{  
    int speed=10;  
    //Cant seperate above stmt
    //like below
    //int speed; speed=10;
    
    
    Bike7(){
    	speed=102;
    	System.out.println("speed is "+speed);}  
   
    {speed=100;
    System.out.println("Instance initializer");}  
    static
    {
    	System.out.println("Static Block");
    }
       
    public static void main(String args[]){  
    Bike7 b1=new Bike7();  
    Bike7 b2=new Bike7();  
    }      
} 