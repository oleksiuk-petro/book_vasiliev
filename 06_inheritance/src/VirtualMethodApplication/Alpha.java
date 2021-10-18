package VirtualMethodApplication;

class Alpha {
    String name;

    void objectCreated() {
        System.out.println("Створений об’єкт класу Alpha");
    }

    void hello() {
        System.out.println("Об’єкт класу Alpha");
    }

    void show() {
        hello();
        System.out.println("Поле name: " + name);
    }

    Alpha(String txt) {
        objectCreated();
        name = txt;
    }
}
