package chain_of_responsability;

public abstract class AHandler {
	
	protected AHandler nextPerson;

	public void successor(AHandler nextPerson) {
		this.nextPerson = nextPerson;
	}
	public abstract void processOrder(Order o);
}
