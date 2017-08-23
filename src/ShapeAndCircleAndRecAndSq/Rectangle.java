package ShapeAndCircleAndRecAndSq;


public class Rectangle extends Shape {

    private double _width = 1.0;
    private double _length = 1.0;

    public Rectangle(){}
    public Rectangle (double width, double lenght) {
        _width = width;
        _length = lenght;
    }
    public Rectangle (double width, double length, String color, boolean filled){
        super(color, filled);
        _width = width;
        _length = length;
    }
    public double getWidth() {
        return _width;
    }
    public void setWidth (double width) {
        _width = width;
    }
    public double getLength() {
        return _length;
    }
    public void setLength(double length) {
        _length = length;
    }
    public double getArea () {
        return _length * _width;
    }
    public double getPerimeter () {
        return 2* _length + 2*_width;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with width = ")
                .append(_width)
                .append(" and length = ")
                .append(_length)
                .append("which is a subclass of")
                .append(super.toString());
        return sb.toString();

    }
}
