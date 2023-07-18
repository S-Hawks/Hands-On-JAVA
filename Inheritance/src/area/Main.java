package area;

import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Tringle tringle = new Tringle();
        System.out.println("Area of Generic Shape " + shape.getArea(4, 4));
        System.out.println("Area of Tringle " + tringle.getArea(4,4));
    }
}
