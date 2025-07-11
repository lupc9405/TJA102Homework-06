package hw7;


public class Cat extends Animal  {
	private static final long serialVersionUID = -6993826991026456901L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
