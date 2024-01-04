public class Products {
	private final int pid;
	private final double price;
	private final int quantity;

	// Constructor
	public Products(int pid, double price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	// Implementation of calcTax method for sales tax calculation

	public double calcSalesTax() {
		return Taxable.calcTax(price * quantity, Taxable.salesTax);
	}

	// Accessor for pid
	public int getPid() {
		return pid;
	}
}
