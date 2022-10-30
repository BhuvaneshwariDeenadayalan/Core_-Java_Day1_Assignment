package assignment;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	2,3,5,7,11	for(i=0;i<=5,i++)
		
	
		int n=11;		
		
		for (int i=2;i<=n-1;i++) {
		
		if(n%2==0)
			System.out.println("NotPrime");
		
		else
			System.out.println("Prime");
		
		}
			//System.out.println(i);
			//if 

	}

}


//Home Assignber is prime
//
//Goal: To understand the problem solving, looping and conditional statement
//
//a) Create a class by name: IsPrime
//b) Create a main method using shortcut
//c) Write a logic to find if the given number is prime or not
//d) Print if it is prime or not
//
//Hint: Iterate through all numbers from 2 to n-1 (input) and 
//for every number check if it divides n (input). 
//If we find any number that divides(1 or same number), print prime.
//If nothing divides, then print non-prime.