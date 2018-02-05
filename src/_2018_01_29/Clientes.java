package _2018_01_29;

public class Clientes extends Personas {

	Integer deuda = 0;
	
	
	
	
	public Clientes() {
		super();
		
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
		//return "Clientes [deuda=" + deuda + ", Id=" + Id + ", nombre=" + nombre + ", edad=" + edad + "]";
		return "Clientes{" +super.toString()+ "deuda: "+deuda + "}";
	}
	
	
	
	
	
	
	
}
