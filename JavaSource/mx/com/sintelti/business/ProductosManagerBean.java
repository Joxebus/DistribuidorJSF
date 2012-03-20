package mx.com.sintelti.business;

import mx.com.sintelti.dao.ProductosColeccionesDAO;
import mx.com.sintelti.domain.ProductoEntity;
import mx.com.sintelti.util.SpringUtil;
import org.springframework.context.ApplicationContext;

public class ProductosManagerBean {
	
	private ApplicationContext context = SpringUtil.getContext();
	private ProductosColeccionesDAO bdProductos = context.getBean("bdProductos",ProductosColeccionesDAO.class);
	
	private String nombre;
	private float precio;
	private int existencia;
	
	public void agregarNuevoProducto(){
		System.out.println("--Productos en stock--");
		ProductoEntity producto = context.getBean("producto", ProductoEntity.class);
		producto.setNombre(nombre);
		producto.setExistencia(existencia);
		producto.setPrecio(precio);
		bdProductos.insertar(producto);
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
	
	
	

}
