package OverrideMethodApplication;

class Bravo extends Alpha {
    //цілочислове поле
    int code;

    //перевизначення методу
    @Override
    void show() {
        System.out.println("Об’єкт класу Bravo");
        System.out.println("Поле name - " + name);
        System.out.println("Поле code - " + code);
    }

    //конструктор класу
    Bravo(String name, int code) {
        super(name); //виклик конструктора суперкласу
        this.code = code;
    }
}
