
public class Apps {

	public static void main(String[] args) {
		Citizen c1 = new Citizen();
		c1.setId("3432425");
		c1.setName("Jmae");
		c1.setGender("Male");
		c1.setNation("US");
		c1.setYear(1934);
		
		System.out.print(c1.toString()+"\n");
		
		Citizen c2 = new Citizen("225477","Jerry",1927,"female","EN");
		System.out.print(c2.toString());
		
	}

}
