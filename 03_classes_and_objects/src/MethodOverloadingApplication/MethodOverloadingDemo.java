package MethodOverloadingApplication;

class MyClass {

    int number;
    char symbol;

    void set(int n) {
        number = n;
    }

    void set(char s) {
        symbol = s;
    }

    void set(int n, char s) {
        set(n);
        set(s);
    }

    void set() {
        set(0, 'Z');
    }

    void show() {
        System.out.println("Значення полів " + number + " та " + symbol);
    }

    void show(String txt) {
        System.out.println(txt + ": значення полів " + number + " та " + symbol);
    }

    void show(String txt1, String txt2) {
        System.out.println(txt1 + ": " + number);
        System.out.println(txt2 + ": " + symbol);
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        MyClass objA, objB;

        objA = new MyClass();
        objB = new MyClass();

        objA.set(100);
        objA.set('A');

        System.out.println("Об’єкт objA:");
        objA.show();

        objB.set();
        objB.show("Об’єкт objB");

        objB.set(200, 'B');

        System.out.println("Об’єкт objB після змін:");
        objB.show("Число", "Символ");
    }
}
