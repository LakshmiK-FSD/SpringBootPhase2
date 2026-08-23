package org.example;
public class Student {
    private int age;
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

    public void setId(int id) {
        this.id = id;
    }

    public Writer getWrite() {
        return write;
    }

    public void setWrite(Writer write) {
        this.write = write;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public  Student(){
        System.out.println("student obj created");
    }

   public void show(){
        System.out.println("Stusdent now learn spring boot");
        write.writer();
    }

}