public class Employees implements Taxable {
	private final int empId;
	private final String name;
	private final double salary;

	// Constructor
	public Employees(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Implementation of calcTax method for income tax calculation

	public double calcIncomeTax() {
		return Taxable.calcTax(salary, Taxable.incomeTax);
	}

	// Accessor for empId
	public int getEmpId() {
		return empId;
	}

	// Accessor for name
	public String getName() {
		return name;
	}
}
