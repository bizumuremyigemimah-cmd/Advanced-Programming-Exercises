package Exercise3;

public class Car extends Vehicle{
	public void drive() {
        System.out.println("Car is driving");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();

        c.move();
        c.drive();
	}

}
