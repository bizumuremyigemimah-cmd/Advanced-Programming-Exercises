package Exercise3;

public class Dogg implements PetActions {
		@Override
	    public void makeSound() {
	        System.out.println("Dogg barks");
	    }

	    public static void main(String[] args) {

	        Dogg d = new Dogg();

	        d.makeSound();
	}

}
