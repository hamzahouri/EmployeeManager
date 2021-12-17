package manager;

public class HourlyEmployee extends Employee implements Displayable {
	private double hour_rate;
	private int no_of_hour;
	
	
	public HourlyEmployee(String name, String address, int ssn, Gender sex, double hour_rate, int no_of_hour) {
		super(name, address, ssn, sex);
		this.hour_rate = hour_rate;
		this.no_of_hour = no_of_hour;
	}
	public double getHour_rate() {
		return hour_rate;
	}
	public void setHour_rate(double hour_rate) {
		this.hour_rate = hour_rate;
	}
	public int getNo_of_hour() {
		return no_of_hour;
	}
	public void setNo_of_hour(int no_of_hour) {
		this.no_of_hour = no_of_hour;
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
		return no_of_hour*hour_rate;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [hour_rate=" + hour_rate + ", no_of_hour=" + no_of_hour + "]";
	}

}
