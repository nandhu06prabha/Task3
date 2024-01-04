public // Interface Taxable
interface Taxable {
	double salesTax = 0.07; // 7%
	double incomeTax = 0.105; // 10.5%

	// Abstract method to calculate tax
	// Static method to calculate tax
	static double calcTax(double amount, double taxRate) {
		return amount * taxRate;
	}
}
