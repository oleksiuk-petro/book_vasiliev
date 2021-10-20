package ExtendingInterfaceApplication;

interface First {

    default void alpha() {
        System.out.println("Інтерфейс First: метод alpha()");
    }

    default void bravo() {
        System.out.println("Інтерфейс First: метод bravo()");
    }

    default void charlie() {
        System.out.println("Інтерфейс First: метод charlie()");
    }

    void delta();
}
