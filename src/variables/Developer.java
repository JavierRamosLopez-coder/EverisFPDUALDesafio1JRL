package variables;

/**
 * Clase que determina un desarrollador
 */
public class Developer {

	/** N?mero de empleados */
	private final static int numOfEmployees = 4;
	
	/** ID de empleado*/
	private int employeId;
	
	/** N?mero de d?as de vacaciones*/
	private static int daysOfVacations = 21;
	
	/** Nombre de la empresa, que ser? Everis por defecto*/
	private final static String nameOfCompany = "Everis";
	
	/** Nombre de los empleados*/
	private String nameOfEmployee;
	
	/** N?mero total de empleados*/
	private static int allEmployees = 127;
	
	/** N?mero de d?as libres*/
	private int freeDays;

	/** Generaci?n del constructor */
	public Developer(int employeId, String nameOfEmployee) {
		this.employeId = employeId;
		this.nameOfEmployee = nameOfEmployee;
	}

	// Generaci?n de los m?todos getters y setters

	/** M?todo encargado de devolvernos el valor del atributo EmployeId */
	public int getEmployeId() {
		return employeId;
	}

	/** M?todo encargado de modificar el valor del atributo EmployeId */
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	/** M?todo encargado de devolvernos el valor del atributo DaysOfVacations */
	public static int getDaysOfVacations() {
		return daysOfVacations;
	}

	/** M?todo encargado de modificar el valor del atributo DaysOfVacations */
	public static void setDaysOfVacations(int daysOfVacations) {
		Developer.daysOfVacations = daysOfVacations;
	}

	/** M?todo encargado de devolver el valor del atributo NameOfEmployee */
	public String getNameOfEmployee() {
		return nameOfEmployee;
	}

	/** M?todo encargado de modificar el valor del atributo NameOfEmployee */
	public void setNameOfEmployee(String nameOfEmployee) {
		this.nameOfEmployee = nameOfEmployee;
	}

	/** M?todo encargado de devolver el valor del atributo AllEmployees */
	public static int getAllEmployees() {
		return allEmployees;
	}

	/** M?todo encargado de modificar el valor del atributo AllEmployees */
	public static void setAllEmployees(int allEmployees) {
		Developer.allEmployees = allEmployees;
	}

	/** M?todo encargado de devolver el valor del atributo NumOfEmployees */
	public static int getNumofemployees() {
		return numOfEmployees;
	}

	/** M?todo encargado de modificar el valor del atributo NumOfEmployees */
	public static String getNameofcompany() {
		return nameOfCompany;
	}

	/** M?todo encargado de devolver el valor del atributo FreeDays */
	public int getFreeDays() {
		return freeDays;
	}

	/** M?todo encargado de modificar el valor del atributo FreeDays */
	public void setFreeDays(int freeDays) {
		this.freeDays = freeDays;
	}
}
