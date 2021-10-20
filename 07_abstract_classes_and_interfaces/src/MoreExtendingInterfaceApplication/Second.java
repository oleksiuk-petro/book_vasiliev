package MoreExtendingInterfaceApplication;

interface Second extends First {

    @Override
    default void alpha() {
        First.super.alpha();
        System.out.println("Інтерфейс Second: метод alpha()");
    }

    default void bravo() {
        System.out.println("Інтерфейс Second: метод bravo()");
    }
}
