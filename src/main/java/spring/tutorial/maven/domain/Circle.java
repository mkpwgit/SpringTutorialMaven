package spring.tutorial.maven.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

    @Autowired
    @Qualifier("pointA")
    private Point center;

    public Point getCenter() {
        return center;
    }

//    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle with the center: "+center);
    }
}
