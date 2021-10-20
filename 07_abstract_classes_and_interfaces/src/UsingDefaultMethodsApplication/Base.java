package UsingDefaultMethodsApplication;

// інтерфейс із методом, який має код за замовчуванням
interface Base {

    // звичайний метод
    void hello();

    // метод з кодом за замовчуванням
    default void show(String txt) {
        System.out.println("Інтерфейс Base: " + txt);
    }
}
