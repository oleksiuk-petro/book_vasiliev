package ExtendingInterfaceApplication;

interface Second extends First {

    @Override
    void bravo();

    @Override
    default void charlie() {
        System.out.println("Інтерфейс Second: метод charlie()");
    }

    void echo();
}
