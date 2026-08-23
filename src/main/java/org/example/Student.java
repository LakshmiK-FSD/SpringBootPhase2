package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("33")
    private int age;
    @Value("2")
    private int id;

    private Writer write;

    public Student(int age, int id, Writer write) {
        this.age = age;
        this.id = id;
        this.write = write;
    }

    public int getId() {
        return id;
    }

    public Writer getWrite() {
        return write;
    }



    public int getAge() {
        return age;
    }

    public  Student(){
        System.out.println("student obj created");
    }
    @Autowired
    public Student( @Qualifier("keyBoard") Writer write) {
        this.write = write;
    }

    public void show(){
        System.out.println("Stusdent now learn spring boot");
        System.out.println("age"+getAge());
       System.out.println("ID"+getId());
        write.writer();
    }

}