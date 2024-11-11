package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //Java Based config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean("alien", Alien.class);
        //obj1.setAge(25);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop dt = context.getBean("com2",Desktop.class);
//        dt.compile();
//        Desktop dt1 = context.getBean("com2",Desktop.class);
//        dt1.compile();
       /* XML based config
        //This line creates a container. Also it will look at spring.xml and create objects to all the bean.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Alien obj1 = (Alien)context.getBean("alien");
        Alien obj1 = context.getBean("alien", Alien.class);
        System.out.println(obj1.getAge());
        //System.out.println(obj1.getLap());
        obj1.code();

//            Alien obj2 = (Alien)context.getBean("alien");
//            System.out.println(obj2.age);
        //obj2.code();
        //System.out.println( "Hello World!" );

        */
    }
}
