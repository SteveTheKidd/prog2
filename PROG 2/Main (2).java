class Animal{
    public void animalSound(){
        System.out.println("The animal produced a sound!");
    }
}


class Pigeon extends Animal{
    public void animalSound(){
        System.out.println("Kruu! Kruu!");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("Meow! Meow!");
    }
}

public class Main
{
	public static void main(String[] args) {
		Animal myAnimalObj = new Animal();
		Animal myPigeon = new Pigeon();
		Animal myCat = new Cat();
		
		myAnimalObj.animalSound();
		myPigeon.animalSound();
		myCat.animalSound();
	}
}

