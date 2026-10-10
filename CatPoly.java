package Exercise3;

public class CatPoly extends AnimalPoly {
	@Override
    public void sound(){
        System.out.println("Cat says Meow");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalPoly a = new AnimalPoly();

        a.sound();
	}

}
