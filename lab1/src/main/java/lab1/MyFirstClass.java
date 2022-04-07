package lab1;

public class MyFirstClass {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		PersonLab p = new PersonLab();
		p.setFirstName("TesetA");
		System.out.println("hello " + p.getFirstName());

		for (int i = 0; i < 3; i++) {
			
			printMyPerson(i);
			
			
		}

	}

	/**
	 * My method
	 * @param i
	 */
	private static void printMyPerson(int i) {
		// TODO Auto-generated method stub

		String newName = "Person_" + i;
		PersonLab myPerson = new PersonLab();
		myPerson.setFirstName(newName);
		System.out.println("hello " + myPerson.getFirstName());
	}

}
