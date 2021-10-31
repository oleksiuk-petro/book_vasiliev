package UsingGenClassApplication;

class UsingGenClassDemo {
    public static void main(String[] args) {

        // створюємо об’єкти різних типів-обгорток
        MyClass<Integer> objA = new MyClass<>(100);
        MyClass<Character> objB = new MyClass<>('B');
        MyClass<String> objC = new MyClass<>("green");

        // викликаємо метод show() для кожного об’єкта
        objA.show();
        objB.show();
        objC.show();
    }
}
