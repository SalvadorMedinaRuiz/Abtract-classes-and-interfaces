
public class TestChicken {

	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Chicken();
		Chicken object3 = new Chicken();

		if (object1.equals(object2))
			System.out.println("1 same as 2");
		else 
			System.out.println("1 different 2");
		if (object1.equals(object3))
			System.out.println("1 same as 3");
		else 
			System.out.println("1 different 3");
		
		if (object3.equals(object2))
			System.out.println("2 same as 3");
		else 
			System.out.println("2 different 3");
	}

}
