/**
 * 
 */

/**
 * @author Berkling
 *
 */
public class ModeratorSubscriber implements ISubscriber {

	/* (non-Javadoc)
	 * @see ISubscriber#Notify()
	 */
	public void notifyMe() {
		System.out.println("make sure all is well");	
	}

	public void notifyMe(String message) {
		System.out.println(message);	
	}


}
