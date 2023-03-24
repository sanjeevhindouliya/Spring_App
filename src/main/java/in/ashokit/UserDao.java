package in.ashokit;

// Component
public class UserDao {
	
	//Declarative approach 
	// Annotation approach we can not use bean xml files
	//@PostConstruct
	public void init() {
		System.out.println("getting db connection...");
	}
	
	public void getData() {
		System.out.println("getting data from db...");
	}
	// @PreDestroy
	public void destroy() {
		System.out.println("closing db connection...");
	}

}
