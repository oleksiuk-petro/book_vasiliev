package GenTypeExtendingApplication;

// головний клас
class GenTypeExtendingDemo {

    // головний метод
    public static void main(String[] args) {
        // об’єкти створюються на основі узагальненого класу
        MyClass<Alpha> objA = new MyClass<>(new Alpha("Alpha", 123));
        MyClass<Bravo> objB = new MyClass<>(new Bravo("Bravo", 321, 'B'));
        // виклик методу show() з об’єктів
        objA.show();
        objB.show();
    }
}