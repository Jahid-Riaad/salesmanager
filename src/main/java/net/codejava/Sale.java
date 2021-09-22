package net.codejava;

public class Sale {

	private int id;
	private String item_name;
	private int quantity;
	private float amount;

	protected Sale() {
	}



	protected Sale(String item_name, int quantity, float amount) {
		this.item_name = item_name;
		this.quantity = quantity;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", item_name=" + item_name + ", quantity=" + quantity + ", amount=" + amount + "]";
	}

}
