package modelo;

public abstract class Personas  {
	private Integer Id= 0;
	private String nombre = "";
	private Integer edad = 0;
	

	public Personas() {
		
	}

	public Personas(Integer id, String nombre, Integer edad) {
		
		this.Id 	= 	id		;
		this.nombre = 	nombre	;
		this.edad 	= 	edad	;
	}

	@Override
	public String toString() {
		return  "Personas [Id_persona=" + Id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}


	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	

}