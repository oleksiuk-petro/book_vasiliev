package ExtendingAndImplementingApplication;

interface First {

    String getFirst();

    default void show() {
        System.out.println("Інтерфейс First: метод show()");
    }
}
