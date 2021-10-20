package MoreDefaultMethodsApplication;

interface First {

    default void hello() {
        System.out.println("Метод з інтерфейсу First");
    }
}
