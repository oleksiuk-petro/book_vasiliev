package ObjectAsResultApplication;

class MyClass {

    private int code;
    private String name;

    MyClass(int n, String s) {
        System.out.println("Створення об’єкта:");
        set(n, s).show();
    }

    MyClass set(int n) {
        code = n;
        return this; //повертається посилання на об’єкт
    }

    MyClass set(String s) {
        name = s;
        return this;
    }

    MyClass set(int n, String s) {
        return set(n).set(s);
    }

    void show() {
        System.out.println("Поле code: " + code);
        System.out.println("Поле name: " + name);
        System.out.println("----------");
    }
}
