package programacionAvanzada;

public class SalaDeCine {
	private Integer cantidadTotalDeButacas;
	private Integer cantidadDeFilas;
	private Integer cantidadDeButacasPorFila;
	private Boolean[][] butacas;
	
	public SalaDeCine(Integer cantidadTotalDeButacas, Integer cantidadDeFilas, Integer cantidadDeButacasPorFila) {
		this.cantidadTotalDeButacas = cantidadTotalDeButacas;
		this.cantidadDeFilas = cantidadDeFilas;
		this.cantidadDeButacasPorFila = cantidadDeButacasPorFila;
		this.butacas = new Boolean[cantidadDeFilas][cantidadDeButacasPorFila];
		for(int i = 0; i < cantidadDeFilas; i++) {
			for(int j = 0; i < cantidadDeButacasPorFila; j++) {
				this.butacas[i][j] = false;
			}	
		}
	}
	
	public Boolean consultarSiEstaOcupada(Integer fila, Integer butaca) {
		Boolean estaOcupada = false;
		if(this.butacas[fila][butaca] == true) {
			estaOcupada = true;
		}
		return estaOcupada;
	}
	
	public Boolean ocuparButaca(Integer fila, Integer butaca) {
		Boolean sePudoOcuparLaButaca = false;
		if(consultarSiEstaOcupada(fila, butaca) == false) {
			this.butacas[fila][butaca] = true;
			sePudoOcuparLaButaca = true;
		}
		return sePudoOcuparLaButaca;
	}
	
	public Integer consultarCantidadDeButacasOcupadas() {
		Integer cantidadDeButacasOcupadas = 0;
		for(int i = 0; i < this.cantidadDeFilas; i++) {
			for(int j = 0; i < this.cantidadDeButacasPorFila; j++) {
				if(consultarSiEstaOcupada(i, j) == true) {
					cantidadDeButacasOcupadas++;
				}
			}	
		}
		return cantidadDeButacasOcupadas;
	}
	
	public Boolean hayEspacioPara(Integer cantidadDePersonas) {
		Boolean hayEspacio = false;
		Integer cantidadDeButacasLibres = 0;
		return false;
	}
}
