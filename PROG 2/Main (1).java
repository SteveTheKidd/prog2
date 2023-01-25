// Abstract Class 
abstract class Animal{
    //abstract method
    public abstract void animalSound();
    
    //regular method
    public void sound(){
        System.out.println("Awwww");
    }
}

// Subclass(child)
class Dog extends Animal{
    public void animalSound(){
        System.out.println("Aww! Aww!");
    }
}


public class Main
{
	public static void main(String[] args) {
		Dog myDog = new Dog(); // Dog Object
		
		myDog.animalSound();
		
		myDog.sound();
	}
}

