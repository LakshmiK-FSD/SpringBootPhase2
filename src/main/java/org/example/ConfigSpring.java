package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigSpring {
    @Bean(name = "lk")
    public Student student(@Qualifier("noa") Writer write1)
    {
        Student student = new Student();
        student.setAge(33);
        student.setId(2);
        student.setWrite(write1);
        return student;
    }
    @Bean(name = "lk2")
    public Student student2(@Qualifier("noa") Writer write1)
    {
        return new Student(33,2,write1);
    }

@Bean(name="noa")
@Primary
    public Pen pen(){
        return new Pen();
}
    @Bean
    @Primary
    public KeyBoard key(){
        return new KeyBoard();
    }
}