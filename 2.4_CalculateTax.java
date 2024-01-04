import java.util.Scanner;

public class CalculateTax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Accept employee information
		System.out.println("Enter Employee ID:");
		int empId = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter Employee Name:");
		String empName = scanner.nextLine();
		System.out.println("Enter Employee Salary:");
		double empSalary = scanner.nextDouble();

		Employees employee = new Employees(empId, empName, empSalary);

		// Accept product information
		System.out.println("Enter Product ID:");
		int productId = scanner.nextInt();
		System.out.println("Enter Product Price:");
		double productPrice = scanner.nextDouble();
		System.out.println("Enter Product Quantity:");
		int productQuantity = scanner.nextInt();

		Products product = new Products(productId, productPrice, productQuantity);

		System.out.println("Employee ID: " + employee.getEmpId());
		System.out.println("Employee Name: " + employee.getName());
		// Print income tax for employee

		System.out.println("Income Tax for Employee: " + employee.calcIncomeTax());

		System.out.println("Product ID: " + product.getPid());

		// Print sales tax for product
		System.out.println("Sales Tax for Product: " + product.calcSalesTax());

	}
}
