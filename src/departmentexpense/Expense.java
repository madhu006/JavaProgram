package departmentexpense;

public class Expense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object
		Department department1 = new Department();
		Manager manager1 = new Manager();
		Manager manager11 = new Manager();
		Manager manager111 = new Manager();
		Manager manager22 = new Manager();
		Manager manager222 = new Manager();
		Developer developer2222 = new Developer();
		manager222.addDeveloper(developer2222);
		Tester tester2222 = new Tester();
		manager222.addTester(tester2222);
		
		Developer developer222 = new Developer();
		manager22.addDeveloper(developer222);
		Tester tester222 = new Tester();
		manager22.addTester(tester222);
	
		manager11.addManager(manager111);
		manager22.addManager(manager222);
		
		manager1.addManager(manager11);
		manager1.addManager(manager22);
		department1.addManager(manager1);
		
		// compute price
		System.out.println("Department1"+department1.price());
		System.out.println("Manager1"+manager1.priceAllUnderThisManager());
		System.out.println("Manager11"+manager11.priceAllUnderThisManager());
		System.out.println("Manager22"+manager22.priceAllUnderThisManager());
		System.out.println("Manager111"+manager111.priceAllUnderThisManager());
		System.out.println("Manager222"+manager222.priceAllUnderThisManager());
		

	}

}
