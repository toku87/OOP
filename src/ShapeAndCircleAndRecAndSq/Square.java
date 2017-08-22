package ShapeAndCircleAndRecAndSq;


public class Square extends Rectangle {

    public Square () {}
    public Square (double side) {
        super(side,side);
    }
    public Square (double side, String color, boolean filled) {
        super(side,side,color, filled);
    }
    public double getSide() {
        return getLenght();
    }
    public void setSide (double side) {
        super.setLenght(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth (double side) {
        super.setWidth(side);
        super.setLenght(side);
    }
}
