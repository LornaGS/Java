package qa;

public class Rectangle extends Shape{

    private  double height;
    private  double weight;
    public Rectangle(String colour, String name, double x, double y, double height, double weight) {
        super(colour, name, x, y);
        this.height=height;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public boolean isSquare() {

        return this.weight == this.height;
    }

    @Override
    public double getArea() {
        return (this.weight*this.height);
    }

    @Override
    public Point getCentrePoint() {
       double centreX = getX() +weight/2;
       double centreY = getY() +height/2;
       return new Point(centreX, centreY);

    }
}
