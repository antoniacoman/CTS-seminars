package chain_of_responsability;

public class Waiter extends AHandler{

	@Override
	public void processOrder(Order o) {
		 if(o.getDifficulty() < 5) {
			 System.out.println("The waiter is handling this: " + o.getName());
		}else {
			System.out.println("The waiter can't handle this");
			this.nextPerson.processOrder(o);
	}	

}}
