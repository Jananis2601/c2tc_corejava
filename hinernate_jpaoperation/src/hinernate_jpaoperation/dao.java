package hinernate_jpaoperation;

public class dao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private static EntityManagerFactory factory;
		private static EntityManager entityManager;
		static
		{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		}
		public static EntityManager getEntityManager()
		{
		if(entityManager==null || !entityManager.isOpen()) {
		entityManager = factory.createEntityManager();
		}
		return entityManager;
		}
		}
	

