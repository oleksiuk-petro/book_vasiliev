package UsingGenericsApplication;

// узагальнений клас з двома параметрами
class Bravo<X,Y> {

    // поле - це об’єкт узагальненого класу
    Alpha<X> obj;

    // поле узагальненого типу
    Y second;

    // конструктор із двома аргументами узагальненого типу
    public Bravo(X first, Y second) {
        // створення об’єкта на основі узагальненого класу
        obj = new Alpha<X>(first);
        // присвоєння значення полю
        this.second = second;
    }

    // метод для відображення значень полів
    void show() {
        System.out.println("Значення " + obj.get() + " та " + second);
    }
}
