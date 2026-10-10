package Exercise3;

public class YoungDog extends Dogg {
	public void play() {
        System.out.println("YoungDogg is playing");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoungDog y = new YoungDog();

        y.makeSound();
        y.play();
	}

}
