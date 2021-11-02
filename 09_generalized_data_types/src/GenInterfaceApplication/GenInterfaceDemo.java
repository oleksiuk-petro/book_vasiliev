package GenInterfaceApplication;

// головний клас
class GenInterfaceDemo {

    // головний метод
    public static void main(String[] args) {
        // інтерфейсна змінна
        MyMethods ref;
        // створення об’єктів на основі узагальненого класу
        MyClass<Integer> objA = new MyClass<>(123);
        MyClass<Character> objB = new MyClass<>('A');
        // виклик методу з об’єкта класу
        objA.show();
        // інтерфейсній змінній присвоюється значення
        ref = objA;
        // виклик методу через інтерфейсну змінну
        ref.set(321);
        // виклик методів з об’єктів класу
        objA.show();
        objB.show();
        // інтерфейсній змінній присвоюється значення
        ref = objB;
        // виклик методу через інтерфейсну змінну
        ref.set('B');
        // виклик методу з об’єкту класу
        objB.show();
    }
}