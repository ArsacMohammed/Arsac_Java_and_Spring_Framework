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
    	//we can eihter set here or in xml file
    	//obj.setAge(15);
    	System.out.println(obj.getAge());
    	   	
        
    }
}
