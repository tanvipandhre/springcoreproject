package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Alien {
    @Value("25")
    private int age;
    //private int salary;
   // private Laptop lap;
   // @Autowired
   // @Qualifier("laptop")
    private Computer com;

//    public Alien(int age, int salary, Laptop lap) {
//        System.out.println("Para constructor called..");
//        this.age = age;
//        this.salary = salary;
//        this.lap = lap;
//    }

    public Alien() {
        System.out.println("Alien object created.");
    }


//    public Alien(int age, int salary, Computer com) {
//        this.age = age;
//        this.salary = salary;
//        this.com = com;
//    }

    public Computer getCom() {
        return com;
    }
    //Setter Injection
    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("setter called");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    public void code(){
        System.out.println("Coding..");
        //lap.compile();
        com.compile();
    }
}
