package GenTypeExtendingApplication;

// узагальнений клас
class MyClass<X extends Base> {

    // поле узагальненого типу
    X obj;

    // конструктор
    MyClass(X obj) {
        this.obj = obj;
    }

    // метод узагальненого класу
    void show() {
        System.out.println("Об’єкт класу MyClass");
        obj.show();
    }
}