package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    /*
    @Bean
    //@Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }
    @Bean("alien")
    public Alien alien( Computer com){ //@Qualifier("desktop")
        Alien obj = new Alien();
        obj.setAge(25);
        //This is tightly coupled to Desktop
        //obj.setCom(desktop());
        obj.setCom(com);
        return obj;
    }
    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
    */

}
