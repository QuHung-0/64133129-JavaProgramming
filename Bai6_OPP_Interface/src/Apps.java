public class Apps {

	public static void main(String[] args) {
		Cat c = new Cat("meo", false);
		Dog d = new Dog("Max",true);
		
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		
		//khac nhau
		IAnimal c1 = new Cat("meo",false);
		IAnimal d1 = new Dog("Max",true);
		
		System.out.println(c1.toString());
		System.out.println(d1.toString());
	}

}
