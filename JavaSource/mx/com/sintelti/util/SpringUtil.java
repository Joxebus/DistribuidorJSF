package mx.com.sintelti.util;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	
	private static final ApplicationContext CONTEXT =  buildApplicationContext();
	
	private static ClassPathXmlApplicationContext buildApplicationContext() {
		try{
			return new ClassPathXmlApplicationContext("/applicationContext.xml");
		}catch(Throwable err){
			System.err.print(err);
			throw new ExceptionInInitializerError(err);
		}
	}
		
	public static ApplicationContext getContext(){
		return CONTEXT;
	}

}
