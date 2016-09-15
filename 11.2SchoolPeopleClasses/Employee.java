import java.util.Date;

public class Employee extends Person {
	private double salary;
	private Date dateHired;
	private String office;

	Employee() {
		this(100.00, "Namak");
	}

	Employee(double salary, String office) {
		this.salary = salary;
		this.office = office;
		dateHired = new Date();
	}

	public double getSalary() {
		return salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee\n\n"+super.toString() + "Salary: "+getSalary() + "/hr\nOffice: " + getOffice() + "\nDate Created: " + getDateHired() + "\n";
	}
}
