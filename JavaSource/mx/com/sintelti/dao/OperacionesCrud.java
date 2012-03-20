package mx.com.sintelti.dao;

public interface OperacionesCrud {
	
	void insertar(Object o); //Create
	void eliminar(Object o); //Delete
	void actualizar (Object o); //Update
	void listar(); //Read

}
