package variables;

/**
 * Clase que determina un desarrollador
 */
public class Developer {

	/** Número de empleados */
	private final static int numOfEmployees = 4;
	
	/** ID de empleado*/
	private int employeId;
	
	/** Número de días de vacaciones*/
	private static int daysOfVacations = 21;
	
	/** Nombre de la empresa, que será Everis por defecto*/
	private final static String nameOfCompany = "Everis";
	
	/** Nombre de los empleados*/
	private String nameOfEmployee;
	
	/** Número total de empleados*/
	private static int allEmployees = 127;
	
	/** Número de días libres*/
	private int freeDays;

	/** Generación del constructor */
	public Developer(int employeId, String nameOfEmployee) {
		this.employeId = employeId;
		this.nameOfEmployee = nameOfEmployee;
	}

	// Generación de los métodos getters y setters

	/** Método encargado de devolvernos el valor del atributo EmployeId */
	public int getEmployeId() {
		return employeId;
	}

	/** Método encargado de modificar el valor del atributo EmployeId */
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	/** Método encargado de devolvernos el valor del atributo DaysOfVacations */
	public static int getDaysOfVacations() {
		return daysOfVacations;
	}

	/** Método encargado de modificar el valor del atributo DaysOfVacations */
	public static void setDaysOfVacations(int daysOfVacations) {
		Developer.daysOfVacations = daysOfVacations;
	}

	/** Método encargado de devolver el valor del atributo NameOfEmployee */
	public String getNameOfEmployee() {
		return nameOfEmployee;
	}

	/** Método encargado de modificar el valor del atributo NameOfEmployee */
	public void setNameOfEmployee(String nameOfEmployee) {
		this.nameOfEmployee = nameOfEmployee;
	}

	/** Método encargado de devolver el valor del atributo AllEmployees */
	public static int getAllEmployees() {
		return allEmployees;
	}

	/** Método encargado de modificar el valor del atributo AllEmployees */
	public static void setAllEmployees(int allEmployees) {
		Developer.allEmployees = allEmployees;
	}

	/** Método encargado de devolver el valor del atributo NumOfEmployees */
	public static int getNumofemployees() {
		return numOfEmployees;
	}

	/** Método encargado de modificar el valor del atributo NumOfEmployees */
	public static String getNameofcompany() {
		return nameOfCompany;
	}

	/** Método encargado de devolver el valor del atributo FreeDays */
	public int getFreeDays() {
		return freeDays;
	}

	/** Método encargado de modificar el valor del atributo FreeDays */
	public void setFreeDays(int freeDays) {
		this.freeDays = freeDays;
	}
}
