package fpdualeveris;

/**
 * Importaci�n de la clase situada en otro paquete
 */
import variables.Developer;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Main
 * 
 * @author jramlope
 *
 */
public class FpDual {

	/** Declaraci�n de un objeto de la clase Scanner, definido como est�tico */
	static Scanner S = new Scanner(System.in);

	/**
	 * M�todo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Llamada al m�todo est�tico
		variablesChallenge();

	}

	/**
	 * M�todo que va a realizar todas las operaciones del proyecto
	 */
	private static void variablesChallenge() {

		// Creaci�n de variables locales (�mbito m�todo)
		int d1j, d4j, d2j, days;

		String job, names, option;
			System.out.println("Introduzca su trabajo");
			job = S.next();
			
			if (job.equals("programador")) {

				// Creaci�n de los objetos de la clase Developer
				Developer d1 = new Developer(1, "Alonso");
				Developer d2 = new Developer(2, "Inma");
				Developer d3 = new Developer(3, "Fran");
				Developer d4 = new Developer(4, "Javi");

				// Creaci�n de una variable para que guarde el valor del m�todo get de ambas
				// instancias y as� poder manipular la informaci�n
				d1j = d1.getNumofemployees();
				d4j = d4.getNumofemployees();

				// Muestra del n�mero de empleados, desde dos instancias de la clase Developer
				System.out.println("El n�mero de empleados es : " + d1j);
				System.out.println("El n�mero de empleados es : " + d4j);

				if (d1j == d4j) {
					System.out.println("YEES, todo est� correcto");
				} else {
					System.out.println("Los n�meros son distintos");
				}

				// Se procede a mostrar el n�mero de empleado de los programadores
				System.out.println("\t");
				System.out.println("El primer empleado con nombre " + d1.getNameOfEmployee() + ", tiene como ID : "
						+ d1.getEmployeId());
				System.out.println("El primer empleado con nombre " + d2.getNameOfEmployee() + ", tiene como ID : "
						+ d2.getEmployeId());
				System.out.println("El primer empleado con nombre " + d3.getNameOfEmployee() + ", tiene como ID : "
						+ d3.getEmployeId());
				System.out.println("El primer empleado con nombre " + d4.getNameOfEmployee() + ", tiene como ID : "
						+ d4.getEmployeId());

				// Se procede a realizar las operaciones sobre las vacaciones de cada empleado
				// Introducci�n del m�todo getDaysOfVacations en una variable debido a la
				// comodidad
				// para operar sobre las variables y no sobre los m�todos
				d2j = d2.getDaysOfVacations() - 2;
				System.out.println("\t");
				System.out.println("El n�mero de vacaciones que tiene el empleado " + d1.getNameOfEmployee()
						+ ", son de : " + d1.getDaysOfVacations() + " d�as");
				System.out.println("El n�mero de vacaciones que tiene el empleado " + d2.getNameOfEmployee()
						+ ", son de : " + d2j + " d�as");
				System.out.println("El n�mero de vacaciones que tiene el empleado " + d3.getNameOfEmployee()
						+ ", son de : " + d3.getDaysOfVacations() + " d�as");
				System.out.println("El n�mero de vacaciones que tiene el empleado " + d4.getNameOfEmployee()
						+ ", son de : " + d4.getDaysOfVacations() + " d�as");

				// Se procede a mostrar el nombre de la empresa sin la instanciaci�n de objetos
				System.out.println("\t");
				System.out.println("El nombre de la mejor empresa de Espa�a es (xD): " + Developer.getNameofcompany());

				// Se procede a contar el n�mero de empleados, que se ir� actualizando cada vez
				// que se instancie un objeto
				System.out.println("\t");
				d1.setAllEmployees(127 + 1);
				System.out.println("El n�mero de empleados es : " + d1.getAllEmployees());
				d2.setAllEmployees(128 + 1);
				System.out.println("El n�mero de empleados es : " + d2.getAllEmployees());
				d3.setAllEmployees(129 + 1);
				System.out.println("El n�mero de empleados es : " + d3.getAllEmployees());
				d4.setAllEmployees(130 + 1);
				System.out.println("El n�mero de empleados es : " + d4.getAllEmployees());
				
			

				// Se procede a realizar los c�lculos sobre los d�as disfrutables de los
				// empleados
				System.out.println(
						" Introduzca su nombre de programador para consultar sus d�as disfrutables (Alonso, Fran, Javi o Inma)");
				names = S.next();

				// Primera comparaci�n
				if (names.equals("Alonso")) {
					d1.setFreeDays(10);
					System.out.println("Bienvenido, usted tiene " + d1.getFreeDays() + " d�as disfrutables");
					
					// Interacci�n con el usuario
					System.out.println(" � Desea disminuir d�as disfrutables ? (S/N)");
					option = S.next();
					
					// Evaluaci�n de la opci�n introducido por el usuario
					if (option.equals("S")) {

						// Interacci�n con el usuario
						System.out.println(
								"Introduzca el n�mero de d�as a eliminar, aseg�rese de que no elimine m�s d�as de los que tiene");
						days = S.nextInt();

						// Evaluaci�n de otra condici�n dependiendo de los d�as
						if (days > d1.getFreeDays()) {

							System.out.println("ERROR");

						} else {

							d1.setFreeDays(10 - days);
							System.out.println("Gracias por realizar correctamente las instrucciones, le quedan "
									+ d1.getFreeDays() + " d�as disfrutables");

						}

						// Evaluaci�n de la otra opci�n introducida por el usuario
					} else if (option.equals("N")) {
						System.out.println("De acuerdo, que pase buen d�a. Recuerda que dispone de " + d1.getFreeDays()
								+ " d�as disfrutables");
					}

					// Segunda condici�n
				} else if (names.equals("Inma")) {
					d2.setFreeDays(90);
					System.out.println("Bienvenido, usted tiene " + d2.getFreeDays() + " d�as disfrutables");

					// Interacci�n con el usuario
					System.out.println(" � Desea disminuir d�as disfrutables ?(S/N) ");
					option = S.next();
					
					// Evaluaci�n de la opci�n introducido por el usuario
					if (option.equals("S")) {

						// Interacci�n con el usuario
						System.out.println(
								"Introduzca el n�mero de d�as a eliminar, aseg�rese de que no elimine m�s d�as de los que tiene");
						days = S.nextInt();

						// Evaluaci�n de otra condici�n dependiendo de los d�as
						if (days > d2.getFreeDays()) {

							System.out.println("ERROR");

						} else {

							d2.setFreeDays(90 - days);
							System.out.println("Gracias por realizar correctamente las instrucciones, le quedan"
									+ d2.getFreeDays() + " d�as disfrutables");

						}

						// Evaluaci�n de la otra opci�n introducida por el usuario
					} else if (option.equals("N")) {
						System.out.println("De acuerdo, que pase buen d�a. Recuerda que dispone de " + d2.getFreeDays()
								+ " d�as disfrutables");
					}

					// Tercera condici�n
				} else if (names.equals("Fran")) {
					d3.setFreeDays(5);
					System.out.println("Bienvenido, usted tiene " + d3.getFreeDays() + " d�as disfrutables");

					// Interacci�n con el usuario
					System.out.println(" � Desea disminuir d�as disfrutables ? (S/N)");
					option = S.next();

					// Evaluaci�n de la opci�n introducido por el usuario
					if (option.equals("S")) {

						// Interacci�n con el usuario
						System.out.println(
								"Introduzca el n�mero de d�as a eliminar, aseg�rese de que no elimine m�s d�as de los que tiene");
						days = S.nextInt();

						// Evaluaci�n de la opci�n introducido por el usuario
						if (days > d3.getFreeDays()) {

							System.out.println("ERROR");

						} else {

							d3.setFreeDays(5 - days);
							System.out.println("Gracias por realizar correctamente las instrucciones, le quedan"
									+ d3.getFreeDays() + " d�as disfrutables");

						}

						// Evaluaci�n de la otra opci�n introducida por el usuario
					} else if (option.equals("N")) {
						System.out.println("De acuerdo, que pase buen d�a. Recuerda que dispone de " + d3.getFreeDays()
								+ " d�as disfrutables");
					}

					// Cuarta condici�n
				} else if (names.equals("Javi")) {
					d4.setFreeDays(65);
					System.out.println("Bienvenido, usted tiene " + d4.getFreeDays() + " d�as disfrutables");

					// Interacci�n con el usuario
					System.out.println(" � Desea disminuir d�as disfrutables ? (S/N)");
					option = S.next();

					// Evaluaci�n de la opci�n introducido por el usuario
					if (option.equals("S")) {

						// Interacci�n con el usuario
						System.out.println(
								"Introduzca el n�mero de d�as a eliminar, aseg�rese de que no elimine m�s d�as de los que tiene");
						days = S.nextInt();

						// Evaluaci�n de los d�as a eliminar por el usuario
						if (days > d4.getFreeDays()) {

							System.out.println("ERROR");

						} else {

							d3.setFreeDays(65 - days);
							System.out.println("Gracias por realizar correctamente las instrucciones, le quedan"
									+ d4.getFreeDays() + " d�as disfrutables");

						}

						// Evaluaci�n de la otra opci�n introducida por el usuario
					} else if (option.equals("N")) {
						System.out.println("De acuerdo, que pase buen d�a. Recuerda que dispone de " + d4.getFreeDays()
								+ " d�as disfrutables");
					}
				} else {

					System.out.println(
							"El nombre que ha introducido no existe en nuestra BD (imaginaria)");

				}

				// �ltima condici�n, si no se cumpliese las anteriores
			} else {

				System.out.println("Por motivos de la empresa el trabajo tiene que ser programador");

			}
	}
	

}
