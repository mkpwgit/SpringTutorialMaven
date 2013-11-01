package spring.tutorial.maven.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * @author Mikalai Kisel
 */
public class Point {

    private int x;
    private int y;

    @Autowired
    private MessageSource messageSource;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return messageSource.getMessage("drawing.point", new Object[] {x, y}, "Default drawing point message!", new Locale("en"));
    }
}
