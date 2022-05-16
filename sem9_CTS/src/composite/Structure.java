package composite;

import java.util.ArrayList;

public class Structure extends ANode{
	
	private String name;
	//missing price;
	
	private ArrayList<ANode> list = new ArrayList<ANode>();

	@Override
	public String getName() {
		return this.name;
	}

	public Structure(String name) {
		super();
		this.name = name;
	}

	@Override
	public float getPrice() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addNode(ANode elem) {
		list.add(elem);
	}

	@Override
	public void removeNode(ANode elem) {
		//super.removeNode(elem); nu aruncam exceptie
		list.remove(elem);
		
	}

	@Override
	public ANode getNode(int index) {
		//super.getNode(index);
		return this.list.get(index);
	}

	@Override
	public String getInfo() {
		//return super.getInfo();
		String info = ""+this.getName()+" \n";
		for(ANode nod:list) {
			info+=" "+ nod.getInfo() + " \n";
		}
		
		return info;
	}
	
	

}
