package manager;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	public BasePlusCommissionEmployee(String name, String address, int ssn, Gender sex, double gross_sales,
			double commission_rate) {
		super(name, address, ssn, sex, gross_sales, commission_rate);
		// TODO Auto-generated constructor stub
	}

	double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	@Override
	public double earnings() {
		return base + super.earnings();
	}
	
	@Override
	public void  displayAllDetails() {
		super.displayAllDetails();
		
	}
	
	@Override
	public void displayEarnings() {
		System.out.println("Earnings = "+earnings());
	}
}
