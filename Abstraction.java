public class Abstraction {
   public static void main(String args[]) {
      Dog myDog = new Dog("Champ");
      System.out.println(myDog.name); // Champ
      System.out.println(myDog.type); // Mammal
      myDog.run(); // Four Legs
      myDog.bark(); // Woof
      myDog.eat(); // Eating
      myDog.sleep(); // Sleeping
   }
}

abstract class Mammal {
   public String type = "Mammal";
   public String name;
   
   Mammal(String name) {
   	this.name = name;
   }
   
   void printName() {
      System.out.println(this.name);
   }

   abstract void run();
}

interface MammalActions{
	void bark();
	void eat();
	void sleep();
}

class Dog extends Mammal implements MammalActions{
	Dog(String name){
		super(name);
	}
	
	@Override
	void run(){
		System.out.println("Four Legs");
	}
	
	public void bark(){ System.out.println("Woof"); }
	
	public void eat(){  System.out.println("Eating"); }
	
	public void sleep(){ System.out.println("Sleeping"); }
}


