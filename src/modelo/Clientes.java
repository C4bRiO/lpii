package modelo;

public class Clientes extends Personas{
	private Integer deuda;
	

	public Clientes(){
		super();
	}

	public Clientes(Integer id, Integer ci, Integer edad, String nombre,Integer deuda) {
		super(id, ci, edad, nombre);
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
