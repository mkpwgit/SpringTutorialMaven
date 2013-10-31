package spring.tutorial.maven;

import javax.annotation.PostConstruct;

/**
 * @author Mikalai Kisel
 */
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    /**
     * It is documentation.
     */
    public void draw() {
        System.out.println(pointA.getX() +" " + pointA.getY());
        System.out.println(pointB.getX() +" " + pointB.getY());
        System.out.println(pointC.getX() +" " + pointC.getY());
    }

  /*  @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean!!!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean!!!");
    }*/

    @PostConstruct
    public void myInit() {
        System.out.println("My init Bean!!!");
    }
}
