package fpdualeveris;

/**
 * Importación de la clase situada en otro paquete
 */
import variables.Developer;
import java.util.Scanner;

/**
 * Main
 * 
 * @author jramlope
 *
 */
public class FpDual {

	static Scanner S = new Scanner(System.in);

	public static void main(String[] args) {

		// Llamada al método estático
		variablesChallenge();

	}

	/**
	 * Método que va a realizar todas las operaciones del proyecto
	 */
	private static void variablesChallenge() {
		// Creación de variables locales (Ámbito método)
		int d1j, d4j, d2j, days;

		String job, names, option;
		System.out.println("Introduzca su trabajo");
		job = S.next();

		if (job.equals("programador")) {

			// Creación de los objetos de la clase Developer
			Developer d1 = new Developer(1, "Alonso");
			Developer d2 = new Developer(2, "Inma");
			Developer d3 = new Developer(3, "Fran");
			Developer d4 = new Developer(4, "Javi");

			// Creación de una variable para que guarde el valor del método get de ambas
			// instancias y así poder manipular la información
			d1j = d1.getNumofemployees();
			d4j = d4.getNumofemployees();

			// Muestra del número de empleados, desde dos instancias de la clase Developer
			System.out.println("El número de empleados es : " + d1j);
			System.out.println("El número de empleados es : " + d4j);

			if (d1j == d4j) {
				System.out.println("YEES, todo está correcto");
			} else {
				System.out.println("Los números son distintos");
			}

			// Se procede a mostrar el número de empleado de los programadores
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
			// Introducción del método getDaysOfVacations en una variable debido a la comodidad
			// para operar sobre las variables y no sobre los métodos
			d2j = d2.getDaysOfVacations() - 2;
			System.out.println("\t");
			System.out.println("El número de vacaciones que tiene el empleado " + d1.getNameOfEmployee() + ", son de : "
					+ d1.getDaysOfVacations() + " días");
			System.out.println("El número de vacaciones que tiene el empleado " + d2.getNameOfEmployee() + ", son de : "
					+ d2j + " días");
			System.out.println("El número de vacaciones que tiene el empleado " + d3.getNameOfEmployee() + ", son de : "
					+ d3.getDaysOfVacations() + " días");
			System.out.println("El número de vacaciones que tiene el empleado " + d4.getNameOfEmployee() + ", son de : "
					+ d4.getDaysOfVacations() + " días");

			// Se procede a mostrar el nombre de la empresa sin la instanciación de objetos
			System.out.println("\t");
			System.out.println("El nombre de la mejor empresa de España es (xD): " + Developer.getNameofcompany());

			// Se procede a contar el número de empleados, que se irá actualizando cada vez
			// que se instancie un objeto
			System.out.println("\t");
			d1.setAllEmployees(127 + 1);
			System.out.println("El número de empleados es : " + d1.getAllEmployees());
			d2.setAllEmployees(128 + 1);
			System.out.println("El número de empleados es : " + d2.getAllEmployees());
			d3.setAllEmployees(129 + 1);
			System.out.println("El número de empleados es : " + d3.getAllEmployees());
			d4.setAllEmployees(130 + 1);
			System.out.println("El número de empleados es : " + d4.getAllEmployees());

			// Se procede a realizar los cálculos sobre los días disfrutables de los
			// empleados
			System.out.println(
					" Introduzca su nombre de programador para consultar sus días disfrutables (Alonso, Fran, Javi o Inma)");
			names = S.next();

			if (names.equals("Alonso")) {
				d1.setFreeDays(10);
				System.out.println("Bienvenido, usted tiene " + d1.getFreeDays() + " días disfrutables");
				System.out.println(" ¿ Desea disminuir días disfrutables ? (S/N)");
				option = S.next();
				if (option.equals("S")) {

					System.out.println(
							"Introduzca el número de días a eliminar, asegúrese de que no elimine más días de los que tiene");
					days = S.nextInt();
					if (days > d1.getFreeDays()) {

						System.out.println("ERROR");

					} else {

						d1.setFreeDays(10 - days);
						System.out.println("Gracias por realizar correctamente las instrucciones, le quedan"
								+ d1.getFreeDays() + " días disfrutables");

					}

				} else if (option.equals("N")) {
					System.out.println("De acuerdo, que pase buen día. Recuerda que dispone de " + d1.getFreeDays()
							+ " días disfrutables");
				}
			} else if (names.equals("Inma")) {
				d2.setFreeDays(90);
				System.out.println("Bienvenido, usted tiene " + d2.getFreeDays() + " días disfrutables");
				System.out.println(" ¿ Desea disminuir días disfrutables ? ");
				option = S.next();
				if (option.equals("S")) {

					System.out.println(
							"Introduzca el número de días a eliminar, asegúrese de que no elimine más días de los que tiene");
					days = S.nextInt();
					if (days > d2.getFreeDays()) {

						System.out.println("ERROR");

					} else {

						d2.setFreeDays(90 - days);
						System.out.println("Gracias por realizar correctamente las instrucciones, le quedan"
								+ d2.getFreeDays() + " días disfrutables");

					}

				} else if (option.equals("N")) {
					System.out.println("De acuerdo, que pase buen día. Recuerda que dispone de " + d2.getFreeDays()
							+ " días disfrutables");
				}
			} else if (names.equals("Fran")) {
				d3.setFreeDays(5);
				System.out.println("Bienvenido, usted tiene " + d3.getFreeDays() + " días disfrutables");
				System.out.println(" ¿ Desea disminuir días disfrutables ? ");
				option = S.next();
				if (option.equals("S")) {

					System.out.println(
							"Introduzca el número de días a eliminar, asegúrese de que no elimine más días de los que tiene");
					days = S.nextInt();
					if (days > d3.getFreeDays()) {

						System.out.println("ERROR");

					} else {

						d3.setFreeDays(5 - days);
						System.out.println("Gracias por realizar correctamente las instrucciones, le quedan"
								+ d3.getFreeDays() + " días disfrutables");

					}

				} else if (option.equals("N")) {
					System.out.println("De acuerdo, que pase buen día. Recuerda que dispone de " + d3.getFreeDays()
							+ " días disfrutables");
				}
			} else if (names.equals("Javi")) {
				d4.setFreeDays(65);
				System.out.println("Bienvenido, usted tiene " + d4.getFreeDays() + " días disfrutables");
				System.out.println(" ¿ Desea disminuir días disfrutables ? ");
				option = S.next();
				if (option.equals("S")) {

					System.out.println(
							"Introduzca el número de días a eliminar, asegúrese de que no elimine más días de los que tiene");
					days = S.nextInt();
					if (days > d4.getFreeDays()) {

						System.out.println("ERROR");

					} else {

						d3.setFreeDays(65 - days);
						System.out.println("Gracias por realizar correctamente las instrucciones, le quedan"
								+ d4.getFreeDays() + " días disfrutables");

					}

				} else if (option.equals("N")) {
					System.out.println("De acuerdo, que pase buen día. Recuerda que dispone de " + d4.getFreeDays()
							+ " días disfrutables");
				}
			}else {
				
				System.out.println("El nombre que ha introducido no existe en nuestra BD (imaginaria), reinicie el programa");
				
			}

		} else {

			System.out.println("Por motivos de la empresa el trabajo tiene que ser programador");

		}

	}

}
