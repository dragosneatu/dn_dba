package ro.kdr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) {  
	      
		  Configuration configuration=new Configuration();  
		  configuration.configure();  
		  SessionFactory sf=configuration.buildSessionFactory();  
		    
		  Session ss=sf.openSession();  
		  ss.beginTransaction();  
		 //saving objects to session  
		    
		  TestEntity user1=new TestEntity();  
		  user1.setName("Arp2it");
//		  user1.setId(1);
		  ss.save(user1);  
		  TestEntity user2=new TestEntity();  
		  user2.setName("Ank3ita");
//		  user2.setId(2);
		  ss.save(user2);  
		  ss.getTransaction().commit();  
		  ss.close();  
		    
		 }  

}
