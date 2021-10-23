package MoreAnonymousClassApplication;

// інтерфейс
interface Base {

    // метод з кодом за замовчуванням
    default void show() {
        System.out.println("Інтерфейс Base");
    }

    // оголошення методу
    void hello();
}
