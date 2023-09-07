package org.Arsac.ApplicationContextEx;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
 

public class App 
{
    public static void main( String[] args )
    {
    	
    	//  Instead of using classPathApplicationResource ive used FileSystemXmlApplicatinContext to avoid confusion.
    	String fullPath = "C:\\Users\\mm\\Java_Full_Stack_Develop\\Spring 5 _Telusko_learn\\SpringWorkspace\\ApplicationContextEx\\src\\main\\java\\org\\Arsac\\ApplicationContextEx\\spring.xml";
    	ApplicationContext factory = new FileSystemXmlApplicationContext(fullPath);
    	Alien obj = (Alien) factory.getBean("alien"); 
    	obj.code();
    	obj.age=15;
    	System.out.println(obj.age);
    	//  when i did this like for setting obj.age=15 then for obj1.age also addigned to 15 because both  the object created are singleton obejcts and both the object refer to the same reference in spring container
    	Alien obj1 = (Alien) factory.getBean("alien"); 
    	obj1.code();
    	
    	
    	System.out.println(obj.age);
        
    }
}
