package modelo;

public class Clientes extends Personas{
	private Integer deuda;
	

	public Clientes() {
		//super(); Opcional, queda implícito
	}

	public Clientes(Integer id, String nombre, Integer edad,Integer deuda) {
		super(id, nombre, edad);
		this.deuda = deuda;
	}

	public Integer getDeuda() {
		return deuda;
	}

	public void setDeuda(Integer deuda) {
		this.deuda = deuda;
	}

	@Override
	public String toString() {
		return "Clientes"+super.toString() +" [deuda=" + deuda + "]";
	}
	
	
	
	

}
