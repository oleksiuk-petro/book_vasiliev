package UsingInterfaceApplication;

public class UsingInterfaceDemo {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Статична константа: " + MyClass.NUMBER);
        System.out.println("Ціле число: " + obj.getNumber(12.5));
        System.out.println("Символ: " + obj.getSymbol(3));
    }
}
