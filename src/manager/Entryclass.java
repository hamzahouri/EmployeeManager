package manager;

public class Entryclass {

	public static void main(String[] args) {

		Department d1 = new Department(1, "Machine learning");
		
		SalariedEmployee se = new SalariedEmployee("ahmed","rabat",20,Gender.male,500,50,1200 );
		d1.add_employee(se);
		
		HourlyEmployee he = new HourlyEmployee("hamza","casablanca",10,Gender.male,5,50);
		d1.add_employee(he);
		
		CommissionEmployee ce = new CommissionEmployee("nizar","istanbul",40,Gender.male,17,33);
		d1.add_employee(ce);
		
		System.out.println(d1.getemployeecount());
		
		//d1.print_basic_data();
		d1.print_basic_data();
	
	}

}
