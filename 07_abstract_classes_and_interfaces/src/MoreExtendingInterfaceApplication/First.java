package MoreExtendingInterfaceApplication;

interface First {

    default void alpha() {
        System.out.println("Інтерфейс First: метод alpha()");
    }
}
