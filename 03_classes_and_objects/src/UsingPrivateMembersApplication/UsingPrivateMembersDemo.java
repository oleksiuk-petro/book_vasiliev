package UsingPrivateMembersApplication;

class MyClass {

    private static int count = 0;
    private int number;
    private String name;

    MyClass(String n) {
        count++;
        number = count;
        name = n;
        System.out.println("Створено об’єкт з іменем " + name);
    }

    public void show() {
        System.out.println("Назва об’єкта: " + name);
        System.out.println("Номер об’єкта: " + number);
        System.out.println("Кількість об’єктів: " + count);
    }

    public void set(String n) {
        name = n;
    }
}

public class UsingPrivateMembersDemo {

    public static void main(String[] args) {

        MyClass objA = new MyClass("Alpha");
        MyClass objB = new MyClass("Bravo");
        MyClass objC = new MyClass("Charlie");

        objA.show();
        objB.show();
        objC.show();

        objB.set("Second");
        objB.show();
    }
}
