package solidempty.ocp.demo.shape.refactored;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
