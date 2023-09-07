package org.Arsac.ApplicationContextEx;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
 

public class App 
{
    public static void main( String[] args )
    {
    	
    	String fullPath = "C:\\Users\\mm\\Java_Full_Stack_Develop\\Spring 5 _Telusko_learn\\SpringWorkspace\\ApplicationContextEx\\src\\main\\java\\org\\Arsac\\ApplicationContextEx\\spring.xml";
    	ApplicationContext factory = new FileSystemXmlApplicationContext(fullPath);
    	Alien obj = (Alien) factory.getBean("alien"); 
    	obj.code();
    	obj.age=15;
    	System.out.println(obj.age);
    	
    	Alien obj1 = (Alien) factory.getBean("alien"); 
    	obj1.code();
    	// now i ve have used scope in the spring.xml file because this scope used as prototype for creating different object rather like singleton object which makes object refer to same reference.
    	//the obj1.age is now zero.
    	
    	System.out.println(obj1.age);
        
    }
}
