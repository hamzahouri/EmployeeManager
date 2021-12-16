package manager;

public class SalariedEmployee extends Employee implements Displayable{
	double salary,bonus,deduction;
	
	public SalariedEmployee () {
		
	}

	public SalariedEmployee(String name, String address, int ssn, Gender sex, double salary, double bonus,
			double deduction) {
		super(name, address, ssn, sex);
		this.salary = salary;
		this.bonus = bonus;
		this.deduction = deduction;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}
	
	@Override
	public double earnings() {
		return (salary+bonus)-deduction;
	}

	@Override
	public void displayAllDetails() {
    System.out.println(super.toString());
    System.out.println(toString());
	}

	@Override
	public void displayEarnings() {
		System.out.println(earnings());
	}

	

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", bonus=" + bonus + ", deduction=" + deduction + "]";
	}

}
