package variables;

/**
 * Clase Developer
 */
public class Developer {

	// Generación de atributos
	private final static int numOfEmployees = 4;
	private int employeId;
	private static int daysOfVacations = 21;
	private final static String nameOfCompany = "Everis";
	private String nameOfEmployee;
	private static int allEmployees = 127;
	private int freeDays;

	// Generación del constructor
	public Developer(int employeId, String nameOfEmployee) {
		this.employeId = employeId;
		this.nameOfEmployee = nameOfEmployee;
	}

	// Generación de los métodos getters y setters
	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public static int getDaysOfVacations() {
		return daysOfVacations;
	}

	public static void setDaysOfVacations(int daysOfVacations) {
		Developer.daysOfVacations = daysOfVacations;
	}

	public String getNameOfEmployee() {
		return nameOfEmployee;
	}

	public void setNameOfEmployee(String nameOfEmployee) {
		this.nameOfEmployee = nameOfEmployee;
	}

	public static int getAllEmployees() {
		return allEmployees;
	}

	public static void setAllEmployees(int allEmployees) {
		Developer.allEmployees = allEmployees;
	}

	public static int getNumofemployees() {
		return numOfEmployees;
	}

	public static String getNameofcompany() {
		return nameOfCompany;
	}

	public int getFreeDays() {
		return freeDays;
	}

	public void setFreeDays(int freeDays) {
		this.freeDays = freeDays;
	}
}
