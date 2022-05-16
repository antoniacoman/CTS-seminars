package flyweight;

public class Receipt implements IReceipt{

	
	private String name = "Anto SRL";
	private ReceiptType type;

		
	public Receipt(ReceiptType type) {
		super();
		this.type = type;
	}

	@Override
	public void printReceipt(ReceiptData data) {
		System.out.println("Restaurant: " + this.name + " type: " + this.type + " " + data.getPrice());
	}

	
}
