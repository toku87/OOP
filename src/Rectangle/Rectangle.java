package Rectangle;

public class Rectangle {
    private float _length = 1.0f;
    private float _width = 1.0f;

    public Rectangle(){}

    public Rectangle(float length, float width){
        _length = length;
        _width = width;
    }

    public double getLength() {
        return _length;
    }

    public void setLength(float length){
        _length = length;
    }

    public double getWidth() {
        return _width;
    }

    public void setWidth(float width){ _width = width; }

    public double getArea(){
        return _length * _width;
    }

    public double getPerimeter() {return 2*_width + 2 * _length;}

    public String toString(){
        return String.format("Rectangle[length=%f,width=%f]", _length, _width);
    }
}
