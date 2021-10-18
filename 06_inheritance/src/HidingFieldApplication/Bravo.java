package HidingFieldApplication;

class Bravo extends Alpha {
    String name;

    void show() {
        System.out.println("From class Alpha: " + super.name);
        System.out.println("From class Bravo: " + name);
    }

    public Bravo(String a, String b) {
        super(); //конструктор суперкласу (за замовчуванням)
        super.name = a;
        name = b;
    }
}
