package single_inheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class singletable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.creatEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTranscation().begin();
		
		//create one employee
		Employee employee=new Employee();
		employee.setName("Junaid");
		employee.setSalary(50000);
		em.persist(employee);
		
		//create one manager
		Manager manager=new Manager();
		manager.setName("Sha");
		manager.setSalary(90000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("Added oneemployee and manager to database");
		em.close();
		factory.close();
		
		
	}
}
	}

}
