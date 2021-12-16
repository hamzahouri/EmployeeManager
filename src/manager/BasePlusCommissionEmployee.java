package manager;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
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
