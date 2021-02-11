
public class Puppy {
	 private String name;
	 private int age;

	public Puppy(String name) {
		//this construction has one parameter, name.
		System.out.println("Passed Name is :" +name);
	
	
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void printString() {
		System.out.println("puppy's name: " + getName());
		System.out.println("puppy's name: " + getAge());
	}
	
	public static void main(String []args) {
		//Following statement would create an object myPuppy
		Puppy mypuppy = new Puppy("tommy");
		mypuppy.setName ("bobo the clown");
		mypuppy.setAge(10);
		mypuppy.printString();
		 
		Puppy mypuppy2 = new Puppy ("tommy2");
		mypuppy2.setName("furry feet");
		mypuppy2.setAge(25);
		mypuppy2.printString();
	}
}
