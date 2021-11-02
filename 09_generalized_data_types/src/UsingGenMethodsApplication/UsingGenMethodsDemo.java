package UsingGenMethodsApplication;

// головний клас
class UsingGenMethodsDemo {

    // головний метод
    public static void main(String[] args) {
        // створення об’єктів
        MyClass objA = new MyClass("Об’єкт А");
        MyClass objB = new MyClass("Об’єкт B");
        // виклик узагальнених методів з різних об’єктів
        objA.show(123);
        objA.show("ALPHA");
        objA.show('A');
        objB.show(456);
        objB.show("BRAVO");
        objB.show('B');
    }
}