import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 8);

        System.out.println("Współrzędna x: " + point.getX());
        System.out.println("Współrzędna y: " + point.getY());
        
        Point center = new Point(1, 2);
        Circle circle = new Circle(center, 4);

        System.out.println("Środek: "+circle.getCenter().getX()+','+circle.getCenter().getY());
        System.out.println("Promień: "+circle.getRadius());
        System.out.println("Obwód koła: "+circle.calculatePerimeter());
        System.out.println("Pole koła: "+circle.getArea());
    }
}
