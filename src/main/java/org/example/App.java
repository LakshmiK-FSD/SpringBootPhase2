package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);
       Student stut = context.getBean(Student.class);
       stut.show();
        System.out.println( "Hello World!" );
    }
}
