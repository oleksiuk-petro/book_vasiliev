package UsingDefaultMethodsApplication;

class UsingDefaultMethodsDemo {

    public static void main(String[] args) {
        // інтерфейсна змінна
        Base ref;

        // об’єкт класу Alpha
        Alpha objA = new Alpha();
        objA.hello();
        objA.show("об’єктна змінна objA");

        // присвоєння посилання
        ref = objA;
        ref.show("інтерфейсна змінна ref");

        // об’єкт класу Bravo
        Bravo objB = new Bravo();
        objB.hello();
        objB.show("об’єктна змінна objB");

        // присвоєння посилання
        ref = objB;
        ref.show("інтерфейсна змінна ref");
    }
}
