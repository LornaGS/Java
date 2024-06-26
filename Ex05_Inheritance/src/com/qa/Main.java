package com.qa;

public class Main {

    public static void main(String[] args) {


        Circle circ1 = new Circle("red","circ1",0,0,10 );
        Circle circ2 = new Circle("blue","circ2",10,10, 5 );
        Circle circ3 = new Circle("pink","circ3",20,20, 10);

        Rectangle rec1 = new Rectangle("blue", "big one", 2.3, 3.4, 8, 10);
        Rectangle rec2 = new Rectangle("pink", "small one", 1.3, 1.4, 3, 5);
        Rectangle rec3 = new Rectangle("yellow", "tiny one", 0.3, 0.4, 1, 1);

        System.out.println(rec1 + "centre point " + rec1.getCentrePoint() + "Area" + rec1.getArea() +" Is square " +rec1.isSquare());
        System.out.println(rec2 + "centre point " + rec2.getCentrePoint() + "Area" + rec2.getArea() +" Is square " +rec1.isSquare());
        System.out.println(rec3 + "centre point " + rec3.getCentrePoint() + "Area" + rec3.getArea() +" Is square " +rec1.isSquare());
        System.out.println(circ1 + "centre point " + circ1.getCentrePoint() + "Area" + circ1.getArea());
        System.out.println(circ2 + "centre point " + circ2.getCentrePoint() + "Area" + circ2.getArea());
        System.out.println(circ3 + "centre point " + circ3.getCentrePoint() + "Area" + circ3.getArea());


        //interface

        System.out.println("circle Location before move: + " + circ1.getCurrentLocation());

        circ1.move(10.5, 4.3);
        System.out.println("Circle location after the move: " + circ1.getCurrentLocation());


    }
}
