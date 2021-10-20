package SwapObjectsApplication;

class SwapObjectsDemo {

    static void swap(MyClass A, MyClass B) {
        System.out.println("Виконується метод swap()");
        System.out.println("Значення полів до зміни значень:");
        System.out.println("Об’єкт А: " + A.number);
        System.out.println("Об’єкт В: " + B.number);

        // обмін значеннями
        MyClass X = B;
        B = A;
        A = X;

        System.out.println("Значення полів після зміни значень:");
        System.out.println("Об’єкт А: " + A.number);
        System.out.println("Об’єкт В: " + B.number);
        System.out.println("Завершення методу swap()");
    }

    public static void main(String[] args) {
        // створюємо об’єкти
        MyClass objA = new MyClass(100);
        MyClass objB = new MyClass(200);

        System.out.println("Змінні до виклику методу swap(): " + objA.number + " та " + objB.number);
        swap(objA, objB);
        System.out.println("Змінні після виклику методу swap(): " + objA.number + " та " + objB.number);
    }
}
