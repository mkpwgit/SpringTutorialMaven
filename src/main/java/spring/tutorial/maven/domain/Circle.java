package spring.tutorial.maven.domain;


public class Circle implements Shape{

    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle with the center: "+center);
    }
}
