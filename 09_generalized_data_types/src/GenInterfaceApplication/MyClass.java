package GenInterfaceApplication;

// узагальнений клас на основі узагальненого інтерфейсу
class MyClass<X> implements MyMethods<X> {

    // закрите поле узагальненого типу
    private X value;

    // конструктор
    MyClass(X arg) {
        value = arg;
    }

    // описання методів з інтерфейсу
    @Override
    public X get() {
        return value;
    }

    @Override
    public void set(X arg) {
        value = arg;
    }

    // метод для відображення значення поля
    void show() {
        System.out.println("Значення поля: " + get());
    }
}