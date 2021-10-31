package UsingGenericsApplication;

// узагальнений клас з одним параметром
class Alpha<X> {

    // закрите поле узагальненого типу
    private X first;

    // конструктор з аргументом узагальненого типу
    public Alpha(X first) {
        set(first);
    }

    // метод з аргументом узагальненого типу
    // для присвоєння значень полю
    void set(X first) {
        this.first = first;
    }

    // метод повертає результатом значення поля
    X get() {
        return first;
    }
}
