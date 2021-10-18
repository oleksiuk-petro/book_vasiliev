package VirtualMethodApplication;

class Bravo extends Alpha {
    @Override
    void objectCreated() {
        System.out.println("Створений об’єкт класу Bravo");;
    }

    @Override
    void hello() {
        System.out.println("Об’єкт класу Bravo");;
    }

    Bravo(String txt) {
        super(txt); //виклик конструктора суперкласу
    }
}
