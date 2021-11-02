package MoreGenInterfaceApplication;

// головний клас
class MoreGenInterfaceDemo {

    // головний метод
    public static void main(String[] args) {
        // інтерфейсна змінна
        MyMethods ref;

        // створення об’єкта
        Alpha objA = new Alpha(123);
        // виклик методу з об’єкта класу
        objA.show();
        // інтерфейсній змінній присвоюються значення
        ref = objA;
        // виклик методу через інтерфейсну змінну
        ref.set(321);
        // виклик методів з об’єктів класів
        objA.show();

        // створення об’єкта
        Bravo objB = new Bravo('A');
        // виклик методу з об’єкта класу
        objB.show();
        // інтерфейсній змінній присвоюються значення
        ref = objB;
        // виклик методу через інтерфейсну змінну
        ref.set('B');
        // виклик методУ з об’єкта класу
        objB.show();
    }
}
