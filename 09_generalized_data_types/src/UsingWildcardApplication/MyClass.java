package UsingWildcardApplication;

// узагальнений клас
class MyClass<T> {

    // поле узагальненого типу
    T value;

    // конструктор
    MyClass(T val) {
        value = val;
    }
}