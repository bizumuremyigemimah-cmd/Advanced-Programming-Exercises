package Exercise3;

public class StudentInfo {
	private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StudentInfo student = new StudentInfo();

	        student.setName("Jolie");
	        student.setAge(20);

	        System.out.println("Name: " + student.getName());
	        System.out.println("Age: " + student.getAge());
	}

}
