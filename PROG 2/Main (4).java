class Vehicle{
    protected String brand = "Toyota";
    
    public void horn(){
        System.out.println("Beep!! Beep!!");
    }
}

class Main extends Vehicle
{
    private String model = "Vios";
    
	public static void main(String[] args) {
		Main mycar = new Main();
		
		mycar.horn();
		
		System.out.println(mycar.brand + " " + mycar.model);
	}
}

