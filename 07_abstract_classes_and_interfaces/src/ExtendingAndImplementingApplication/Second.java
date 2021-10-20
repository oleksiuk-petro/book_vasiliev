package ExtendingAndImplementingApplication;

interface Second {

    String getSecond();

    default void show() {
        System.out.println("Інтерфейс Second: метод show()");
    }
}
