package UsingGenClassApplication;

class MyClass<X> {

    // поле узагальненого типу
    X data;

    // конструктор з аргументами узагальненого типу
    MyClass(X data) {
        this.data = data;
    }

    // метод для відображення значення поля
    void show() {
        System.out.println("Значення поля: " + data);
    }
}
