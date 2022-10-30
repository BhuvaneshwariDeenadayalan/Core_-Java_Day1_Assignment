package assignment;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for (int i=5;i<=1;i++)
		
		int firstnum =0;
		int secnum =1;
		int sum=0;
		//int n=11;
			
		System.out.println(firstnum);
		System.out.println(secnum);
		
		for (int i=2;i<=11;i++) {sum=secnum+firstnum;
		firstnum=secnum;
		secnum=sum;
		
		System.out.println(sum);
		}
		//	System.out.println("i");
			
	
	
		
		
	}

}

/*Assignment 1: Print Fibonacci series for first 11 numbers

0 1 1 2 3 5 8 13 21 34 55 

Goal: To understand the arthimetic operation and loop

a) Create a class by name: Fibonacci
b) Create a main method using shortcut
c) Write a logic to print Fibonacci from 0 to 56

Hints: 

Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
Print first number
Iterate from 1 to the 11
Add first and second number assign to sum
Assign second number to the first number
Assign sum to the second number
Print sum*/

//
//
