package mx.com.sintelti.domain;

public class UsuarioEntity {
	
	private String nombre;
	private String alias;
	private String pass;
	
	public UsuarioEntity (){}
	
	public UsuarioEntity(String alias, String pass){
		this.alias = alias;
		this.pass = pass;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		char []letras = nombre.toCharArray();
		for(char letra:letras){
			result += letra;
		}
		result *= prime;
		letras = pass.toCharArray();
		for(char letra:letras){
			result += letra;
		}
		result *= prime;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof UsuarioEntity))
			return false;
		UsuarioEntity usuario = (UsuarioEntity) obj;
		if (nombre == null) {
			if (usuario.nombre != null)
				return false;
		} else if (!nombre.equals(usuario.nombre))
			return false;
		if (pass == null) {
			if (usuario.pass != null)
				return false;
		} else if (!pass.equals(usuario.pass))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	

}
