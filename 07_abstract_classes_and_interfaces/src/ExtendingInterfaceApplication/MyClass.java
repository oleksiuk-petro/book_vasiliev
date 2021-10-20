package ExtendingInterfaceApplication;

class MyClass implements Second {

    @Override
    public void bravo() {
        System.out.println("Клас MyClass: метод bravo()");
    }

    @Override
    public void delta() {
        System.out.println("Клас MyClass: метод delta()");
    }

    @Override
    public void echo() {
        System.out.println("Клас MyClass: метод echo()");
    }
}
