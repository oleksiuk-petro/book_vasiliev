package ExtendingGenClassApplication;

// головний клас
class ExtendingGenClassDemo {

    // головний метод
    public static void main(String[] args) {
        // створення об’єктів
        Alpha objA = new Alpha(123);
        Bravo objB = new Bravo("this is object B");
        Charlie objC = new Charlie('C');
        // виклик методу show() з різних об’єктів
        objA.show();
        objB.show();
        objC.show();
    }
}