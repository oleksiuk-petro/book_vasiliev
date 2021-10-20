package MoreExtendingInterfaceApplication;

class MyClass implements Second {

    @Override
    public void bravo() {
        Second.super.bravo();
        System.out.println("Клас MyClass: метод bravo()");
    }
}
