/**
 * 
 */

/**
 * @author Berkling
 *
 */
public class RunObserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ISubscriber me = new UserSubscriber();
		ISubscriber you = new UserSubscriber();
		ISubscriber mod = new ModeratorSubscriber();
		ISubscriber ch = new ChildSubscriber();
		
		TVObservable channel1 = new TVObservable();
		RadioObservable radio1 = new RadioObservable();

		
		channel1.registerObserver(me);
		channel1.registerObserver(you);
		channel1.registerObserver(mod);
		channel1.registerObserver(ch);
		
		radio1.registerObserver(mod);
		
		channel1.notifyObservers();
		
		channel1.unregisterObserver(you);
		
		channel1.notifyObservers();
		
		radio1.notifyObservers("Radio1 is now broadcasting");
		
	}

}
