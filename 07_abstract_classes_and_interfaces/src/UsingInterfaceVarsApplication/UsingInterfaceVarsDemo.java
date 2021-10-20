package UsingInterfaceVarsApplication;

class UsingInterfaceVarsDemo {

    public static void main(String[] args) {
        // інтерфейсна змінна
        Base ref;

        // об’єкт класу Alpha
        ref = new Alpha("which text");
        ref.show();

        // об’єкт класу Bravo
        ref = new Bravo(777);
        ref.show();
    }
}
