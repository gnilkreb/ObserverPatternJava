
public class UserSubscriber implements ISubscriber {

	public void notifyMe() {
		System.out.println("watch the movie");	
	}
	
	public void notifyMe(String message) {
		System.out.println(message);	
	}

}
