package com.qa;

public class Circle extends Shape implements Movable{

    private double circleRadius;
    public Circle(String colour, String name, double x, double y, double circleRadius) {
        super(colour, name, x, y);
        this.circleRadius = circleRadius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "circleRadius=" + circleRadius +
                "} " + super.toString();
    }

    @Override
    public double getArea() {
        return Math.PI;
    }

    @Override
    public Point getCentrePoint() {
            double centreX = getX() ;
            double centreY = getY() ;
            return new Point(centreX, centreY);

        }


        //interface Movable
        public Point getCurrentLocation(){
            return getCentrePoint();

        }

    public void move(double x, double y) {
        setX(getX() + x);
        setY(getY() + y);

    }
    }

