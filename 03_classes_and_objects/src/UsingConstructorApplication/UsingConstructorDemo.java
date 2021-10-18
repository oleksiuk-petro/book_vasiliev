package UsingConstructorApplication;

class MyClass {

    int number;
    char symbol;

    MyClass() {
        number = 100;
        symbol = 'A';
    }

    MyClass(int n, char s) {
        number = n;
        symbol = s;
    }

    void show() {
        System.out.println("Значення полів " + number + " та " + symbol);
    }
}

public class UsingConstructorDemo {

    public static void main(String[] args) {

        //викликається конструктор без аргументів
        MyClass objA = new MyClass();

        //викликається конструктор з двома аргументами
        MyClass objB = new MyClass(200, 'B');

        System.out.println("Об’єкт objA:");
        objA.show();

        System.out.println("Об’єкт objB:");
        objB.show();
    }
}
