package assignment;

public class Car {
	
	public void driveCar (){ System.out.println("1.driveCar");   }
	public void applyBrake (){ System.out.println("2.applyBrake");}
	public void soundHorn () {System.out.println("3.soundHorn");}
	public void isPuncture (){System.out.println("4.isPuncture"); }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car obj1= new Car();
		obj1.driveCar();
		obj1.applyBrake();
		obj1.soundHorn();
		obj1.isPuncture();
	}

}

/*
 * Week1-day1 Assignment:
=====================
    a)Create a class by name : Car
	b)Create a method 
	  driveCar->Have a print statement
	  applyBrake->Have a print statement
	  soundHorn->Have a print statement
	  isPuncture->Have a print statement
	c)Create a main method 
	d)Create an Object
	e)Call the methods using the object
	f)Run and Confirm*/