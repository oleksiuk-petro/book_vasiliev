package BoundedWildcardsApplication;

class BoundedWildcardsDemo {

    // використання суперкласу для Charlie
    static void display(MyClass<? super Charlie> obj) {
        System.out.println(obj);
    }

    // використання підкласу для Charlie
    static void show(MyClass<? extends Charlie> obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        MyClass<Alpha> objA = new MyClass<>(new Alpha("Об’єкт objA"));
        MyClass<Bravo> objB = new MyClass<>(new Bravo("Об’єкт objB"));
        MyClass<Charlie> objC = new MyClass<>(new Charlie("Об’єкт objC"));
        MyClass<Delta> objD = new MyClass<>(new Delta("Об’єкт objD"));
        MyClass<Echo> objE = new MyClass<>(new Echo("Об’єкт objE"));

        display(objA);
        display(objB);
        display(objC);
        // display(objD); // error
        // display(objE); // error

        // show(objA); // error
        // show(objB); // error
        show(objC);
        show(objD);
        show(objE);
    }
}
