package MoreDefaultMethodsApplication;

interface Second {

    default void hello() {
        System.out.println("Метод з інтерфейсу Second");
    }
}
