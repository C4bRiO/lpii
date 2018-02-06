package modelo;

public abstract class Personas  {
	private Integer Id		=  0;
	private Integer ci 		=  0;
	private Integer edad 	=  0;
	private String 	nombre 	= "";
	
	public Personas(){
		
	}
	
	public Personas(Integer id, Integer ci, Integer edad, String nombre) {
		super();
		Id 			= id;
		this.ci 	= ci;
		this.edad 	= edad;
		this.nombre = nombre;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getCi() {
		return ci;
	}
	public void setCi(Integer ci) {
		this.ci = ci;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	

}