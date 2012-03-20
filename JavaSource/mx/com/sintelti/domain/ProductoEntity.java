package mx.com.sintelti.domain;

public class ProductoEntity {

	private Long id;
	private String nombre;
	private float precio;
	private int existencia;
	
	public ProductoEntity() {}
	
	public ProductoEntity(String nombre, float precio, int existencia){
		this.nombre = nombre;
		this.precio = precio;
		this.existencia = existencia;
	}
	
	@Override
	public String toString() {
		return id+".- "+nombre+" \t| "+precio+" \t| "+existencia;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(nombre.equals(((ProductoEntity)obj).nombre) && id ==((ProductoEntity)obj).id)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		char[] letras = nombre.toCharArray();
		for(char letra : letras)
			hash += (letra*3)+5;
		hash+=id;
		return hash;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	
}
