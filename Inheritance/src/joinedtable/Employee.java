package joinedtable;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee=new Employee();
		employee.setName("junaid");
		employee.setSalary(50000);
		em.persist(employee);
		
		//create one manager
		Manager manager=new Manager();
		manager.setName("Sha");
		manager.setSalary(240000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("Added on employee and manager to database");
		em.close();
		factory.close();
		
		
	}


	}
	


