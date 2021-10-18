package UsingAbstractClassApplication;

public class Circle extends ColoredFigure {

    Circle(String clr, int s) {
        super(clr, s);
    }

    @Override
    String getName() {
        return "коло";
    }

    @Override
    double getArea() {
        double k = Math.PI;
        return size * size * k;
    }

    @Override
    String getSizeName() {
        return "радіус";
    }
}
