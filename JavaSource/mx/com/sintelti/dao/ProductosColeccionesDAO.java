package mx.com.sintelti.dao;

import java.util.List;

import mx.com.sintelti.domain.ProductoEntity;

public class ProductosColeccionesDAO implements OperacionesCrud {

	private List<ProductoEntity> listaProductos;
	
	public void insertar(Object producto) {
		if(producto instanceof ProductoEntity){
			listaProductos.add((ProductoEntity)producto);
		}

	}

	public void eliminar(Object producto) {		
		if(producto instanceof ProductoEntity){
			listaProductos.remove((ProductoEntity)producto);
		}
	}

	public void actualizar(Object productoA) {/*
		if(productoA instanceof ProductosEntity && productoB instanceof ProductosEntity){
			int x = listaProductos.indexOf((ProductosEntity)productoA);
			if(x!=-1)
				listaProductos.add(x, (ProductosEntity)productoB);
			else
				listaProductos.add((ProductosEntity)productoB);
		}
		*/
	}

	public void listar() {	
		for(ProductoEntity producto : listaProductos){
			System.out.println(producto);
		}
	}
	
	public void setListaProductos(List<ProductoEntity> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	

}
