package UsingInterfacesApplication;

class MyClass implements First, Second {


    @Override
    public void hello() {
        System.out.println("Метод з інтерфейсу First");
    }

    @Override
    public void hi() {
        System.out.println("Метод з інтерфейсу Second");
    }
}
