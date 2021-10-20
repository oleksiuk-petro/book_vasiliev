package UsingInterfaceApplication;

public class MyClass implements MyInterface {

    @Override
    public int getNumber(double x) {
        return (int) x;
    }

    @Override
    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
}
