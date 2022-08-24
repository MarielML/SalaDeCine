package programacionAvanzada;

import java.util.Scanner;

public class SalaDeCineMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		SalaDeCine showCase = new SalaDeCine(20, 10, 10);

		System.out.println("Bienvenido a la sala de cine!");
		System.out.println("Ingresa una opcion:");

		funciones(teclado, showCase);

	}

	private static void funciones(Scanner teclado, SalaDeCine actual) {
		Integer opcion = 0;
		do {
			opcion = opcionElegida(teclado, actual);
		} while(opcion != 5);
	}

	private static void mostrarMenu() {
		System.out.println("1- Ocupar una butaca");
		System.out.println("2- Consultar si una butaca esta ocupada");
		System.out.println("3- Consultar la cantidad de butacas ocupadas");
		System.out.println("5- Salir");
	}

	private static Integer elegirOpcion(Scanner teclado) {
		mostrarMenu();
		Integer opcion = teclado.nextInt();
		return opcion;
	}

	private static Integer opcionElegida(Scanner teclado, SalaDeCine actual) {
		Integer opcion = 0;
		
		opcion = elegirOpcion(teclado);
		switch (opcion) {
		case 1:
			ocuparButaca(teclado, actual);
			break;
		case 2:
			consultarSiEstaOcupada(teclado, actual);
			break;
		case 3:
			consultarCantidadDeButacasOcupadas(actual);
			break;
		default:
			System.out.println("Error!");
			break;
		}
		return opcion;
	}
	
	private static void ocuparButaca(Scanner teclado, SalaDeCine actual) {
		System.out.println("Ingresa la fila:");
		Integer fila = teclado.nextInt();
		System.out.println("Ingresa la butaca:");
		Integer butaca = teclado.nextInt();
		actual.ocuparButaca(fila, butaca);
		if(actual.ocuparButaca(fila, butaca) == false) {
			System.out.println("La butaca se ocupo correctamente");
		} else {
			System.out.println("La butaca no se pudo ocupar");
		}
	}
	
	public static void consultarSiEstaOcupada(Scanner teclado, SalaDeCine actual) {
		System.out.println("Ingresa la fila:");
		Integer fila = teclado.nextInt();
		System.out.println("Ingresa la butaca:");
		Integer butaca = teclado.nextInt();
		if(actual.consultarSiEstaOcupada(fila, butaca) == true) {
			System.out.println("Esta ocupada");
		} else {
			System.out.println("No esta ocupada");
		}
	}
	
	public static void consultarCantidadDeButacasOcupadas(SalaDeCine actual) {
		Integer cantidadDeButacasOcupadas = actual.consultarCantidadDeButacasOcupadas();
		System.out.println("Hay " + cantidadDeButacasOcupadas + " butacas ocupadas");
	}
}
