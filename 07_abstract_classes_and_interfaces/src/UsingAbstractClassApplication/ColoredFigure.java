package UsingAbstractClassApplication;

abstract class ColoredFigure {

    String color;
    int size;

    ColoredFigure(String clr, int s) {
        color = clr;
        size = s;
    }

    void show() {
        System.out.println("Фігура: " + color + " " + getName());
        System.out.println("Характерний розмір (" + getSizeName() + "): " + size);
        System.out.printf("Площа: %.3f\n", getArea());
        String line = "";
        for (int k = 1; k <= 30; k++) {
            line += "*";
        }
        System.out.println(line);
    }

    String getSizeName() {
        return "ребро";
    }

    abstract String getName();

    abstract double getArea();
}
