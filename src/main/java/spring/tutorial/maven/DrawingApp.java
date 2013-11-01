package spring.tutorial.maven;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.maven.domain.Shape;

/**
 * @author Mikalai Kisel
 */
public class DrawingApp {

    public static void main(String [] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();

    }
}
