package manager;

public class CommissionEmployee extends Employee implements Displayable{
	
	private double gross_sales;
	private double commission_rate;
	public double getGross_sales() {
		return gross_sales;
	}
	public void setGross_sales(double gross_sales) {
		this.gross_sales = gross_sales;
	}
	public double getCommission_rate() {
		return commission_rate;
	}
	public void setCommission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
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
	public double earnings() {
		return gross_sales*commission_rate;
	}
	@Override
	public String toString() {
		return "CommissionEmployee [gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + "]";
	}

}
