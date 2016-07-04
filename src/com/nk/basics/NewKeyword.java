package com.nk.basics;

class Calculation{  

	void fact(int  n){  
		int fact=1;  
		for(int i=1;i<=n;i++){  
			fact=fact*i;  
		}  
		System.out.println("factorial is "+fact);  
	}  
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	public static void main(String args[]){  
		new Calculation().fact(5);//calling method with annonymous object
		Calculation c1=new Calculation();
		/*try {
			Calculation c2=(Calculation)c1.clone();
			c2.fact(7);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}  
}  
