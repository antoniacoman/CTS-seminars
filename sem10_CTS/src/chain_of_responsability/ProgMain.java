package chain_of_responsability;

public class ProgMain {

	public static void main(String[] args) {

		AHandler waiter = new Waiter();
		AHandler chef = new Chef();
		
		waiter.successor(chef);
		waiter.processOrder(new Order("coffee", 3));
		waiter.processOrder(new Order("pizza", 15));

	}

}
