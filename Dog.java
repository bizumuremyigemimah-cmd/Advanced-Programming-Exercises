package Exercise3;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();

        d.sound();
        d.eat();
	}
	@Override
    void sound() {
        System.out.println("Dog barks");
}
}