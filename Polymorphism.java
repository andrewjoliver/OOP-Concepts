class Polymorphism{
	public static void main(String[] args){
		Automobile myAutomobile = new Automobile();
		Car myCar = new Car();
		myAutomobile.printDescription(); // Automobile Driving
		myCar.printDescription(); // Car Driving
		myAutomobile.drive(55); // Driving at 55 MPH
		myAutomobile.drive("Ford"); // Driving a Ford
	}
}
class Automobile{
	void printDescription(){
		System.out.println("Automobile Driving");
	}
	void drive(int speed){
		System.out.println("Driving at " + speed + " MPH");
	}
	void drive(String carType){
		System.out.println("Driving a " + carType);
	}
}
class Car extends Automobile{
	@Override
	void printDescription(){
		System.out.println("Car Driving");
	}
}



