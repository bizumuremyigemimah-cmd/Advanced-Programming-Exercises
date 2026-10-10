package Exercise3;

public class AnimalInfo {
	private int eyes = 2;
    private String name = "Dogg";
    private String color = "Black";

    public void showAttributes() {

        System.out.println("Eyes: " + eyes);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalInfo animal = new AnimalInfo();

        animal.showAttributes();
	}

}
