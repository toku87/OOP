package ShapeAndCircleAndRectAndSqrWithAbstract;


public abstract class Shape {

    protected String _color = "red";
    protected boolean _filled = true;

    public Shape(){}
    public Shape (String color, boolean filled) {
        _color = color;
        _filled = filled;
    }
    public String getColor() {
        return _color;
    }
    public void setColor (String color) {
        _color = color;
    }
    public boolean isFilled () {
        return _filled;
    }
    public void setFilled (boolean filled) {
        _filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("A Shape with color of ");
        sb.append(_color).append(" and ");
        if (_filled) {
            sb.append("filled");
        }
        else {
            sb.append("not filled");
        }
        return sb.toString();
    }
}
