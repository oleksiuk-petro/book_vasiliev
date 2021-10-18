package UsingAbstractClassApplication;

public class Square extends ColoredFigure {

    Square(String clr, int s) {
        super(clr, s);
    }

    @Override
    String getName() {
        return "квадрат";
    }

    @Override
    double getArea() {
        double k = 1;
        return size * size * k;
    }
}
