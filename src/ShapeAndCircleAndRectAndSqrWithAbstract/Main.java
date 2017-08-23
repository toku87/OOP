package ShapeAndCircleAndRectAndSqrWithAbstract;


public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(2.5,"green",true);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(5.0, 5.0, "pink", false);
        System.out.println(rectangle);
    }
}
