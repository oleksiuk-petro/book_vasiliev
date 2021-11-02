package UsingWildcardApplication;

// головний клас
class UsingWildcardDemo {

    static <T> void show(MyClass<T> obj) {
        System.out.println("\nВиклик методу show():");
        System.out.println(obj.value);
    }

    static void display(MyClass<?> obj) {
        System.out.println("\nВиклик методу display():");
        System.out.println(obj.value);
    }

    // головний метод
    public static void main(String[] args) {
        MyClass<Integer> objA = new MyClass<>(100);
        MyClass objB = new MyClass<>('B');
        MyClass<?> objC = new MyClass<>("Об’єкт objC");
        // виклик методів з різними аргументами
        show(objA);
        display(objA);
        show(objB);
        display(objB);
        show(objC);
        show(objC);
    }
}