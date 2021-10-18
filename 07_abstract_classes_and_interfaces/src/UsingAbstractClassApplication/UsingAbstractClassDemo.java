package UsingAbstractClassApplication;

class UsingAbstractClassDemo {

    public static void main(String[] args) {

        Triangle t = new Triangle("red", 2);
        Square s = new Square("black", 3);
        Circle c = new Circle("yellow", 1);

        System.out.println("Використання об’єктних змінних підкласу");
        t.show();
        s.show();
        c.show();

        //об’єктна змінна абстрактного суперкласу
        ColoredFigure f;

        System.out.println("Використання об’єктної змінної" +
                " абстрактного суперкласу");

        f = t;
        f.show();

        f = s;
        f.show();

        f = c;
        f.show();
    }
}
