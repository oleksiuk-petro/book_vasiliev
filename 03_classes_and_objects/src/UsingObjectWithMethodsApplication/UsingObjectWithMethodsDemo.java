package UsingObjectWithMethodsApplication;

import javax.swing.*;

class MyClass {

    int number;
    char symbol;

    // метод присвоєння значень полям
    void set(int n, char s) {
        number  = n;
        symbol = s;
    }

    // метод повертає текст
    String getInfo() {
        String text = "Число: " + number + "\n";
        text += "Символ: " + symbol;
        return text;
    }
}

public class UsingObjectWithMethodsDemo {

    public static void main(String[] args) {

        MyClass objA = new MyClass();
        MyClass objB = new MyClass();

        objA.set(100,'A');
        objB.set(200,'B');

        JOptionPane.showMessageDialog(
                null,
                objA.getInfo(),
                "Перший об’єкт",
                JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                objB.getInfo(),
                "Другий об’єкт",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
