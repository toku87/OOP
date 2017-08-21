package SimpleCircle;

//Jest to klasa Circle, którą pozbawiono color:String (z kartki z zadankami)
public class SimpleCircle {
    private double _radius = 1.0;

    public SimpleCircle(){}

    public SimpleCircle(double radius){
        _radius = radius;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double radius){
        _radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radius, 2d);
    }

    public double getCircumference(){
        return 2*Math.PI * _radius;
    }

    public String toString(){
        return String.format("Circle[radius=%f]", _radius);
    }
}
