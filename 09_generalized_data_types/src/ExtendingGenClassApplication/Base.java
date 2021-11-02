package ExtendingGenClassApplication;

// узагальнений батьківський клас
class Base<X> {

    // узагальнене поле
    X data;

    // конструктор
    public Base(X data) {
        this.data = data;
    }

    // метод для відображення значення поля
    void show() {
        System.out.println(data);
    }
}