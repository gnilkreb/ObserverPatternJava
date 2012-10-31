/**
 * 
 */

/**
 * @author Berkling
 *
 */
public class ChildSubscriber implements ISubscriber {

	/* (non-Javadoc)
	 * @see ISubscriber#notifyMe()
	 */
	public void notifyMe() {
		System.out.println("definitely want to watch this rated R movie");	

	}

	/* (non-Javadoc)
	 * @see ISubscriber#notifyMe(java.lang.String)
	 */
	public void notifyMe(String m) {
		System.out.println(m);	
	}

}
