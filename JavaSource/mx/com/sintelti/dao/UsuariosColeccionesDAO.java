package mx.com.sintelti.dao;

import java.util.ArrayList;
import java.util.List;

import mx.com.sintelti.domain.UsuarioEntity;

public class UsuariosColeccionesDAO implements OperacionesCrud {

	private List<UsuarioEntity> listaUsuarios;
	
	public void insertar(Object usuario) {
		if(usuario instanceof UsuarioEntity){
			listaUsuarios.add((UsuarioEntity)usuario);
		}

	}

	public void eliminar(Object usuario) {		
		if(usuario instanceof UsuarioEntity){
			listaUsuarios.remove((UsuarioEntity)usuario);
		}
	}

	public void actualizar(Object productoA) {
		
	}

	public void listar() {	
		for(UsuarioEntity usuario : listaUsuarios){
			System.out.println(usuario);
		}
	}
	
	public void setListaUsuarios(List<UsuarioEntity> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	public UsuarioEntity buscar(UsuarioEntity usuario){
		if(listaUsuarios.indexOf(usuario) != -1)
			return listaUsuarios.get(listaUsuarios.indexOf(usuario));
		else
			return null;
		
	}
	
	

}
