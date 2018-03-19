package Circle;

public class item {
	
	private int id;
	private String name;
	private float price;
	
	private bid[] bidsArr;

	public item() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		if(id>0) {
		this.id = id;
		return;
	}
		else 
		{
			System.err.println("Invalid id");
		}
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
