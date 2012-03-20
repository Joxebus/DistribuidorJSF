package mx.com.sintelti.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try{
			//Aqu� se crea la SessionFactory y carga la conf de hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();			
		}catch(Throwable ex){
			//Log de la excepci�n
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}		
	}
	
	public static SessionFactory getSessionFactory(){
		return SESSION_FACTORY;
	}

}
