package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String,Employee>employees = new HashMap<>();
	
	public void addEmployee(Employee employee) {
		employees.put(employee.getEmpNumber(), employee);
		
	}

	public Collection<Employee> getAllEmployees() {
		
		return employees.values();
	}
	
	public void showPayRates() {
		for (Employee employee: employees.values()) {
			System.out.println(employee.getEmpNumber()+ " "+ employee.getSalary());
		}
	}
	
	
	public void showAllMedicalPersonnel() {
		for (Employee employee : employees.values()) {
			if (employee instanceof CareTaker) {
				System.out.println(employee);
			}
		}
	}

	public void showAllBloodDrawers() {
		for (Employee employee : employees.values()) {
			if (employee instanceof BloodDrawer) {
				System.out.println(employee);
			}
		}
	}
	
	
}
