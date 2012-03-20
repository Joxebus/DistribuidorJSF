package mx.com.sintelti.dao;

import java.util.List;

import mx.com.sintelti.domain.ProductoEntity;
import mx.com.sintelti.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ProductosBDDAO implements OperacionesCrud {

	public void insertar(Object o) {
		Session session = 
        	HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();        
        session.save((ProductoEntity)o);
        session.getTransaction().commit();		
	}

	public void eliminar(Object o) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    	session.beginTransaction();
    	
    	ProductoEntity producto = (ProductoEntity) session.createCriteria(ProductoEntity.class)
						.add(Restrictions.idEq(((ProductoEntity)o).getId()))
						.uniqueResult();    	
    	session.delete(producto);
    	session.getTransaction().commit();		
	}

	public void actualizar(Object o) {
		Session session = 
			HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        ProductoEntity producto = (ProductoEntity) session.createCriteria(ProductoEntity.class)
        				.add(Restrictions.idEq(((ProductoEntity)o).getId()))
    					.uniqueResult();
        producto.setNombre(((ProductoEntity)o).getNombre());
        producto.setPrecio(((ProductoEntity)o).getPrecio());
        producto.setExistencia(((ProductoEntity)o).getExistencia());
        session.update(producto);
        
        session.getTransaction().commit();
		
	}

	public void listar() {
		Session session = 
    		HibernateUtil.getSessionFactory().getCurrentSession();
    	session.beginTransaction();
    	
    	Criteria crit = session.createCriteria(ProductoEntity.class);    	
    	@SuppressWarnings("unchecked")
    	List<ProductoEntity> productos = crit.list();    	
    	for (ProductoEntity producto : productos){
    		System.out.println(producto);
    	}
		
	}
	

}
