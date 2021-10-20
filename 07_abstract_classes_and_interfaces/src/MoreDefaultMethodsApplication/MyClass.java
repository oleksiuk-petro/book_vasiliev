package MoreDefaultMethodsApplication;

class MyClass implements First, Second {

    // реалізація двох версій методу з інтерфейсів
    @Override
    public void hello() {
        First.super.hello();
        Second.super.hello();
    }
}
