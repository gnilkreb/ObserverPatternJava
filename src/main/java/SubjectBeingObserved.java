import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Berkling
 *
 */
public abstract class SubjectBeingObserved {

	private List<ISubscriber>  list = new ArrayList<ISubscriber>(); 
	
	public void registerObserver(ISubscriber s){
		list.add(s);
	}
	
	public void unregisterObserver(ISubscriber s){
		list.remove(s);
	}
	
	public void notifyObservers(){
		for (ISubscriber s : list) {
			s.notifyMe();
		}	
	}
	
	public void notifyObservers(String message){
		for (ISubscriber s : list) {
			s.notifyMe(message);
		}
	}
	
}
