package chain_of_responsability;

public class Chef extends AHandler{

	@Override
	public void processOrder(Order o) {
		if(o.getDifficulty() >= 5) {
			System.out.println("The chef is handling this: " + o.getName());
		}else {
			//throw exception
		}

}
}