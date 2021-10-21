package CopyConstructorApplication;

class CopyConstructorDemo {

    public static void main(String[] args) {
        MyClass objA = new MyClass("Жовтий", 200);
        System.out.println("\nОб’єкт objA");
        objA.show();

        MyClass objB = new MyClass(objA);
        System.out.println("\nОб’єкт objB");
        objB.show();

        // зміна значень полів першого об’єкта
        objA.name = "Червоний";
        objA.code = 100;
        System.out.println("\nОб’єкт objA");
        objA.show();

        // створення об’єкта з викликом конструктора
        // створення копії (аргумент - анонімний об’єкт)
        MyClass objC = new MyClass(new MyClass("Зелений", 300));
        System.out.println("\nОб’єкт objC");
        objC.show();
    }
}
