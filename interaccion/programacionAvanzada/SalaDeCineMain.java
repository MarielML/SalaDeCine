package programacionAvanzada;

public class SalaDeCineMain {

	public static void main(String[] args) {
		SalaDeCine showCase = new SalaDeCine(20, 10, 10);
		
		System.out.println("Bienvenido a la sala de cine!");
		System.out.println("Ingresa una opcion:");
		
		
		showCase.ocuparButaca(3, 1);
		showCase.ocuparButaca(2, 0);
		showCase.ocuparButaca(0, 1);
		if(showCase.consultarSiEstaOcupada(3, 1) == true) {
			System.out.println("Está ocupada");
		} else {
			System.out.println("Está desocupada");
		}
		System.out.println(showCase.consultarCantidadDeButacasOcupadas());

	}

	private static void mostrarMenu() {
		System.out.println("1- Ocupar una butaca");
		System.out.println("2- Consultar si una butaca esta ocupada");
		System.out.println("3- Consultar la cantidad de butacas ocupadas");
		System.out.println("5- Salir");
	}
}
