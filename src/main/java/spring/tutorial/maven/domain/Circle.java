package spring.tutorial.maven.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import spring.tutorial.maven.event.DrawEvent;

import java.util.Locale;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

    @Autowired
    @Qualifier("pointA")
    private Point center;

    private ApplicationEventPublisher publisher;

    @Autowired
    private MessageSource messageSource;

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
        System.out.println(messageSource.getMessage("greeting", null, "Default greeting!", new Locale("en")));
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
