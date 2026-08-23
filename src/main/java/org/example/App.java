package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);
        Student stu =(Student) context.getBean("lk");
        stu.show();
        Student stu2 =(Student) context.getBean("lk2");
        stu2.show();
        System.out.println( "Hello World!" );
    }
}
