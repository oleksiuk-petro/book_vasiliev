package ObjectAsResultApplication;

class ObjectAsResultDemo {

    // метод створює об’єкт класу MyClass
    static MyClass createObject(int n, String s) {
        return new MyClass(n, s);
    }

    public static void main(String[] args) {
        // створюємо перший об’єкт
        MyClass obj = new MyClass(100, "alpha");

        // змінюємо значення першого об’єкта
        obj.set(200).show();
        obj.set("bravo").show();
        obj.show();

        // створюємо другий об’єкт та змінюємо його значення
        createObject(300, "charlie").set(400, "delta").show();
    }
}
