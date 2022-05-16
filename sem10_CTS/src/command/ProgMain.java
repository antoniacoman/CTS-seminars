package command;

public class ProgMain {

	public static void main(String[] args) {

		Chef c1 = new Chef("John");
		Chef c2 = new Chef("Maria");
		
		Waiter waiter = new Waiter();
		waiter.noteCommands(new PizzaOrder(c1, "diavola"));
		waiter.noteCommands(new PastaOrder(c2, "carbonarra"));
		waiter.noteCommands(new PizzaOrder(c1, "margherita"));
		
		waiter.sendCommands();

	}

}
