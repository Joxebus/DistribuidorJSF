package mx.com.sintelti.business;

import mx.com.sintelti.dao.UsuariosColeccionesDAO;
import mx.com.sintelti.domain.UsuarioEntity;
import mx.com.sintelti.util.SpringUtil;
import org.springframework.context.ApplicationContext;

public class UsuariosBean {
	
	private ApplicationContext context = SpringUtil.getContext();
	private UsuariosColeccionesDAO bdUsuarios = context.getBean("bdUsuarios",UsuariosColeccionesDAO.class);
	private String alias;
	private String pass;
	private String nombre;
	
	
	public String login(){
		UsuarioEntity usuario = context.getBean("usuario",UsuarioEntity.class);
		usuario.setAlias(alias);
		usuario.setPass(pass);
		return bdUsuarios.buscar(usuario)!=null ? "succes" : "error";		
	}
	
	public String registrarNuevoUsuario(){
		UsuarioEntity usuario = context.getBean("usuario",UsuarioEntity.class);
		usuario.setAlias(alias);
		usuario.setPass(pass);
		usuario.setNombre(nombre);
		bdUsuarios.insertar(usuario);
		return "ready";
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
